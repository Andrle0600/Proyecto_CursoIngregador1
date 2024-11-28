package DAO;

import DAO.exceptions.NonexistentEntityException;
import Modelo.DetalleVenta;
import Modelo.Producto;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.Venta;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class DetalleVentaJpaController implements Serializable {

    public DetalleVentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public DetalleVentaJpaController() {
        emf = Persistence.createEntityManagerFactory("integradorPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalleVenta detalleVenta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();

            // Sincronizar la relación con la Venta
            Venta venta = detalleVenta.getVenta();
            if (venta != null) {
                venta = em.getReference(venta.getClass(), venta.getIdVenta());
                detalleVenta.setVenta(venta);
            }

            // Sincronizar la relación con el Producto
            Producto producto = detalleVenta.getProducto();
            if (producto != null) {
                producto = em.getReference(producto.getClass(), producto.getIdProducto());
                detalleVenta.setProducto(producto);
            }

            // Persistir el DetalleVenta
            em.persist(detalleVenta);

            if (venta != null) {
                venta.getDetallesVenta().add(detalleVenta);
                venta = em.merge(venta);
            }
            if (producto != null) {
                producto.getDetallesVenta().add(detalleVenta);
                producto = em.merge(producto);
            }

            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalleVenta detalleVenta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();

            // Encontrar el detalle persistente
            DetalleVenta persistentDetalleVenta = em.find(DetalleVenta.class, detalleVenta.getIdDetalleVenta());
            Venta ventaOld = persistentDetalleVenta.getVenta();
            Venta ventaNew = detalleVenta.getVenta();
            Producto productoOld = persistentDetalleVenta.getProducto();
            Producto productoNew = detalleVenta.getProducto();

            // Sincronizar nueva Venta
            if (ventaNew != null) {
                ventaNew = em.getReference(ventaNew.getClass(), ventaNew.getIdVenta());
                detalleVenta.setVenta(ventaNew);
            }

            // Sincronizar nuevo Producto
            if (productoNew != null) {
                productoNew = em.getReference(productoNew.getClass(), productoNew.getIdProducto());
                detalleVenta.setProducto(productoNew);
            }

            // Actualizar el DetalleVenta
            detalleVenta = em.merge(detalleVenta);

            // Actualizar lista de detalles en Venta antigua
            if (ventaOld != null && !ventaOld.equals(ventaNew)) {
                ventaOld.getDetallesVenta().remove(detalleVenta);
                ventaOld = em.merge(ventaOld);
            }

            // Actualizar lista de detalles en Venta nueva
            if (ventaNew != null && !ventaNew.equals(ventaOld)) {
                ventaNew.getDetallesVenta().add(detalleVenta);
                // Actualizar el total de la venta nueva
                double nuevoTotal = ventaNew.getTotal() + detalleVenta.getSubtotal();
                ventaNew.setTotal(nuevoTotal);
                em.merge(ventaNew);
            }

            // Actualizar lista de detalles en Producto antiguo
            if (productoOld != null && !productoOld.equals(productoNew)) {
                productoOld.getDetallesVenta().remove(detalleVenta);
                productoOld = em.merge(productoOld);
            }

            // Actualizar lista de detalles en Producto nuevo
            if (productoNew != null && !productoNew.equals(productoOld)) {
                productoNew.getDetallesVenta().add(detalleVenta);
                em.merge(productoNew);
            }

            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = detalleVenta.getIdDetalleVenta();
                if (findDetalleVenta(id) == null) {
                    throw new NonexistentEntityException("The detalleVenta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();

            // Buscar el DetalleVenta
            DetalleVenta detalleVenta;
            try {
                detalleVenta = em.getReference(DetalleVenta.class, id);
                detalleVenta.getIdDetalleVenta(); // Forzar inicialización para verificar si existe
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalleVenta with id " + id + " no longer exists.", enfe);
            }

            // Actualizar la Venta relacionada
            Venta venta = detalleVenta.getVenta();
            if (venta != null) {
                venta.getDetallesVenta().remove(detalleVenta);
                // Actualizar el total de la venta
                double nuevoTotal = venta.getTotal() - detalleVenta.getSubtotal();
                venta.setTotal(nuevoTotal);
                venta = em.merge(venta);
            }

            // Actualizar el Producto relacionado
            Producto producto = detalleVenta.getProducto();
            if (producto != null) {
                producto.getDetallesVenta().remove(detalleVenta);
                producto = em.merge(producto);
            }

            // Eliminar el DetalleVenta
            em.remove(detalleVenta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalleVenta> findDetalleVentaEntities() {
        return findDetalleVentaEntities(true, -1, -1);
    }

    public List<DetalleVenta> findDetalleVentaEntities(int maxResults, int firstResult) {
        return findDetalleVentaEntities(false, maxResults, firstResult);
    }

    private List<DetalleVenta> findDetalleVentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalleVenta.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public DetalleVenta findDetalleVenta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalleVenta.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalleVentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalleVenta> rt = cq.from(DetalleVenta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<DetalleVenta> findDetallesByPedidoId(Venta venta) {
        EntityManager em = getEntityManager();
        String query = "SELECT d FROM DetalleVenta d WHERE d.venta = :venta";
        try {
            return em.createQuery(query, DetalleVenta.class)
                    .setParameter("venta", venta)
                    .getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        } finally {
            em.close();
        }
    }

}
