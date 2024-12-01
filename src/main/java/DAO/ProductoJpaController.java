package DAO;

import DAO.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.Categoria;
import Modelo.Proveedor;
import Modelo.Stock;
import Modelo.DetallePedido;
import Modelo.DetalleVenta;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class ProductoJpaController implements Serializable {

    public ProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ProductoJpaController() {
        emf = Persistence.createEntityManagerFactory("integradorPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Producto producto) {
        if (producto.getDetallesPedido() == null) {
            producto.setDetallesPedido(new ArrayList<DetallePedido>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Categoria categoria = producto.getCategoria();
            if (categoria != null) {
                categoria = em.getReference(categoria.getClass(), categoria.getIdCategoria());
                producto.setCategoria(categoria);
            }
            Proveedor proveedor = producto.getProveedor();
            if (proveedor != null) {
                proveedor = em.getReference(proveedor.getClass(), proveedor.getIdProveedor());
                producto.setProveedor(proveedor);
            }
            Stock stock = producto.getStock();
            if (stock != null) {
                stock = em.getReference(stock.getClass(), stock.getIdStock());
                producto.setStock(stock);
            }
            List<DetallePedido> attachedDetallesPedido = new ArrayList<DetallePedido>();
            for (DetallePedido detallesPedidoDetallePedidoToAttach : producto.getDetallesPedido()) {
                detallesPedidoDetallePedidoToAttach = em.getReference(detallesPedidoDetallePedidoToAttach.getClass(), detallesPedidoDetallePedidoToAttach.getIdDetallePedido());
                attachedDetallesPedido.add(detallesPedidoDetallePedidoToAttach);
            }
            producto.setDetallesPedido(attachedDetallesPedido);
            em.persist(producto);
            if (categoria != null) {
                categoria.getProductos().add(producto);
                categoria = em.merge(categoria);
            }
            if (proveedor != null) {
                proveedor.getProductos().add(producto);
                proveedor = em.merge(proveedor);
            }
            if (stock != null) {
                Producto oldProductoOfStock = stock.getProducto();
                if (oldProductoOfStock != null) {
                    oldProductoOfStock.setStock(null);
                    oldProductoOfStock = em.merge(oldProductoOfStock);
                }
                stock.setProducto(producto);
                stock = em.merge(stock);
            }
            for (DetallePedido detallesPedidoDetallePedido : producto.getDetallesPedido()) {
                Producto oldProductoOfDetallesPedidoDetallePedido = detallesPedidoDetallePedido.getProducto();
                detallesPedidoDetallePedido.setProducto(producto);
                detallesPedidoDetallePedido = em.merge(detallesPedidoDetallePedido);
                if (oldProductoOfDetallesPedidoDetallePedido != null) {
                    oldProductoOfDetallesPedidoDetallePedido.getDetallesPedido().remove(detallesPedidoDetallePedido);
                    oldProductoOfDetallesPedidoDetallePedido = em.merge(oldProductoOfDetallesPedidoDetallePedido);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Producto producto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto persistentProducto = em.find(Producto.class, producto.getIdProducto());
            Categoria categoriaOld = persistentProducto.getCategoria();
            Categoria categoriaNew = producto.getCategoria();
            Proveedor proveedorOld = persistentProducto.getProveedor();
            Proveedor proveedorNew = producto.getProveedor();
            Stock stockOld = persistentProducto.getStock();
            Stock stockNew = producto.getStock();
            List<DetallePedido> detallesPedidoOld = persistentProducto.getDetallesPedido();
            List<DetallePedido> detallesPedidoNew = producto.getDetallesPedido();
            if (categoriaNew != null) {
                categoriaNew = em.getReference(categoriaNew.getClass(), categoriaNew.getIdCategoria());
                producto.setCategoria(categoriaNew);
            }
            if (proveedorNew != null) {
                proveedorNew = em.getReference(proveedorNew.getClass(), proveedorNew.getIdProveedor());
                producto.setProveedor(proveedorNew);
            }
            if (stockNew != null) {
                stockNew = em.getReference(stockNew.getClass(), stockNew.getIdStock());
                producto.setStock(stockNew);
            }
            List<DetallePedido> attachedDetallesPedidoNew = new ArrayList<DetallePedido>();
            for (DetallePedido detallesPedidoNewDetallePedidoToAttach : detallesPedidoNew) {
                detallesPedidoNewDetallePedidoToAttach = em.getReference(detallesPedidoNewDetallePedidoToAttach.getClass(), detallesPedidoNewDetallePedidoToAttach.getIdDetallePedido());
                attachedDetallesPedidoNew.add(detallesPedidoNewDetallePedidoToAttach);
            }
            detallesPedidoNew = attachedDetallesPedidoNew;
            producto.setDetallesPedido(detallesPedidoNew);
            producto = em.merge(producto);
            if (categoriaOld != null && !categoriaOld.equals(categoriaNew)) {
                categoriaOld.getProductos().remove(producto);
                categoriaOld = em.merge(categoriaOld);
            }
            if (categoriaNew != null && !categoriaNew.equals(categoriaOld)) {
                categoriaNew.getProductos().add(producto);
                categoriaNew = em.merge(categoriaNew);
            }
            if (proveedorOld != null && !proveedorOld.equals(proveedorNew)) {
                proveedorOld.getProductos().remove(producto);
                proveedorOld = em.merge(proveedorOld);
            }
            if (proveedorNew != null && !proveedorNew.equals(proveedorOld)) {
                proveedorNew.getProductos().add(producto);
                proveedorNew = em.merge(proveedorNew);
            }
            if (stockOld != null && !stockOld.equals(stockNew)) {
                stockOld.setProducto(null);
                stockOld = em.merge(stockOld);
            }
            if (stockNew != null && !stockNew.equals(stockOld)) {
                Producto oldProductoOfStock = stockNew.getProducto();
                if (oldProductoOfStock != null) {
                    oldProductoOfStock.setStock(null);
                    oldProductoOfStock = em.merge(oldProductoOfStock);
                }
                stockNew.setProducto(producto);
                stockNew = em.merge(stockNew);
            }
            for (DetallePedido detallesPedidoOldDetallePedido : detallesPedidoOld) {
                if (!detallesPedidoNew.contains(detallesPedidoOldDetallePedido)) {
                    detallesPedidoOldDetallePedido.setProducto(null);
                    detallesPedidoOldDetallePedido = em.merge(detallesPedidoOldDetallePedido);
                }
            }
            for (DetallePedido detallesPedidoNewDetallePedido : detallesPedidoNew) {
                if (!detallesPedidoOld.contains(detallesPedidoNewDetallePedido)) {
                    Producto oldProductoOfDetallesPedidoNewDetallePedido = detallesPedidoNewDetallePedido.getProducto();
                    detallesPedidoNewDetallePedido.setProducto(producto);
                    detallesPedidoNewDetallePedido = em.merge(detallesPedidoNewDetallePedido);
                    if (oldProductoOfDetallesPedidoNewDetallePedido != null && !oldProductoOfDetallesPedidoNewDetallePedido.equals(producto)) {
                        oldProductoOfDetallesPedidoNewDetallePedido.getDetallesPedido().remove(detallesPedidoNewDetallePedido);
                        oldProductoOfDetallesPedidoNewDetallePedido = em.merge(oldProductoOfDetallesPedidoNewDetallePedido);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = producto.getIdProducto();
                if (findProducto(id) == null) {
                    throw new NonexistentEntityException("The producto with id " + id + " no longer exists.");
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
            Producto producto;
            try {
                producto = em.getReference(Producto.class, id);
                producto.getIdProducto(); // Verifica que exista el producto
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The producto with id " + id + " no longer exists.", enfe);
            }

            // Anular referencias en DetallePedido
            List<DetallePedido> detallesPedido = producto.getDetallesPedido();
            for (DetallePedido detallePedido : detallesPedido) {
                detallePedido.setProducto(null);
                em.merge(detallePedido);
            }

            // Anular referencias en DetalleVenta
            List<DetalleVenta> detallesVenta = producto.getDetallesVenta();
            for (DetalleVenta detalleVenta : detallesVenta) {
                detalleVenta.setProducto(null);
                em.merge(detalleVenta);
            }

            // Anular referencia en Stock
            Stock stock = producto.getStock();
            if (stock != null) {
                stock.setProducto(null);
                em.merge(stock);
            }

            // Eliminar el producto
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductoEntities() {
        return findProductoEntities(true, -1, -1);
    }

    public List<Producto> findProductoEntities(int maxResults, int firstResult) {
        return findProductoEntities(false, maxResults, firstResult);
    }

    private List<Producto> findProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
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

    public Producto findProducto(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Producto> rt = cq.from(Producto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public Producto findByNombre(String nombre) {
        EntityManager em = getEntityManager();
        String query = "SELECT p FROM Producto p WHERE LOWER(p.nombre) = LOWER(:nombre)";
        try {
            return em.createQuery(query, Producto.class)
                    .setParameter("nombre", nombre)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    public Producto findByCodigo(String codigo) {
        EntityManager em = getEntityManager();
        String query = "SELECT p FROM Producto p WHERE UPPER(p.codigo) = UPPER(:codigo)";
        try {
            return em.createQuery(query, Producto.class)
                    .setParameter("codigo", codigo)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    List<Producto> findByCategory(Categoria categoria) {
        EntityManager em = getEntityManager();
        String query = "SELECT d FROM Producto d WHERE d.categoria = :categoria";
        try {
            return em.createQuery(query, Producto.class)
                    .setParameter("categoria", categoria)
                    .getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        } finally {
            em.close();
        }
    }

}
