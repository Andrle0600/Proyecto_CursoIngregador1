package DAO;

import DAO.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.DetalleVenta;
import Modelo.Venta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class VentaJpaController implements Serializable {

    public VentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public VentaJpaController() {
        emf = Persistence.createEntityManagerFactory("integradorPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Venta venta) {
        if (venta.getDetallesVenta() == null) {
            venta.setDetallesVenta(new ArrayList<DetalleVenta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<DetalleVenta> attachedDetallesVenta = new ArrayList<DetalleVenta>();
            for (DetalleVenta detallesVentaDetalleVentaToAttach : venta.getDetallesVenta()) {
                detallesVentaDetalleVentaToAttach = em.getReference(detallesVentaDetalleVentaToAttach.getClass(), detallesVentaDetalleVentaToAttach.getIdDetalleVenta());
                attachedDetallesVenta.add(detallesVentaDetalleVentaToAttach);
            }
            venta.setDetallesVenta(attachedDetallesVenta);
            em.persist(venta);
            for (DetalleVenta detallesVentaDetalleVenta : venta.getDetallesVenta()) {
                Venta oldVentaOfDetallesVentaDetalleVenta = detallesVentaDetalleVenta.getVenta();
                detallesVentaDetalleVenta.setVenta(venta);
                detallesVentaDetalleVenta = em.merge(detallesVentaDetalleVenta);
                if (oldVentaOfDetallesVentaDetalleVenta != null) {
                    oldVentaOfDetallesVentaDetalleVenta.getDetallesVenta().remove(detallesVentaDetalleVenta);
                    oldVentaOfDetallesVentaDetalleVenta = em.merge(oldVentaOfDetallesVentaDetalleVenta);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Venta venta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Venta persistentVenta = em.find(Venta.class, venta.getIdVenta());
            List<DetalleVenta> detallesVentaOld = persistentVenta.getDetallesVenta();
            List<DetalleVenta> detallesVentaNew = venta.getDetallesVenta();
            List<DetalleVenta> attachedDetallesVentaNew = new ArrayList<DetalleVenta>();
            for (DetalleVenta detallesVentaNewDetalleVentaToAttach : detallesVentaNew) {
                detallesVentaNewDetalleVentaToAttach = em.getReference(detallesVentaNewDetalleVentaToAttach.getClass(), detallesVentaNewDetalleVentaToAttach.getIdDetalleVenta());
                attachedDetallesVentaNew.add(detallesVentaNewDetalleVentaToAttach);
            }
            detallesVentaNew = attachedDetallesVentaNew;
            venta.setDetallesVenta(detallesVentaNew);
            venta = em.merge(venta);
            for (DetalleVenta detallesVentaOldDetalleVenta : detallesVentaOld) {
                if (!detallesVentaNew.contains(detallesVentaOldDetalleVenta)) {
                    detallesVentaOldDetalleVenta.setVenta(null);
                    detallesVentaOldDetalleVenta = em.merge(detallesVentaOldDetalleVenta);
                }
            }
            for (DetalleVenta detallesVentaNewDetalleVenta : detallesVentaNew) {
                if (!detallesVentaOld.contains(detallesVentaNewDetalleVenta)) {
                    Venta oldVentaOfDetallesVentaNewDetalleVenta = detallesVentaNewDetalleVenta.getVenta();
                    detallesVentaNewDetalleVenta.setVenta(venta);
                    detallesVentaNewDetalleVenta = em.merge(detallesVentaNewDetalleVenta);
                    if (oldVentaOfDetallesVentaNewDetalleVenta != null && !oldVentaOfDetallesVentaNewDetalleVenta.equals(venta)) {
                        oldVentaOfDetallesVentaNewDetalleVenta.getDetallesVenta().remove(detallesVentaNewDetalleVenta);
                        oldVentaOfDetallesVentaNewDetalleVenta = em.merge(oldVentaOfDetallesVentaNewDetalleVenta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = venta.getIdVenta();
                if (findVenta(id) == null) {
                    throw new NonexistentEntityException("The venta with id " + id + " no longer exists.");
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
            Venta venta;
            try {
                venta = em.getReference(Venta.class, id);
                venta.getIdVenta();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The venta with id " + id + " no longer exists.", enfe);
            }
            List<DetalleVenta> detallesVenta = venta.getDetallesVenta();
            for (DetalleVenta detallesVentaDetalleVenta : detallesVenta) {
                detallesVentaDetalleVenta.setVenta(null);
                detallesVentaDetalleVenta = em.merge(detallesVentaDetalleVenta);
            }
            em.remove(venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Venta> findVentaEntities() {
        return findVentaEntities(true, -1, -1);
    }

    public List<Venta> findVentaEntities(int maxResults, int firstResult) {
        return findVentaEntities(false, maxResults, firstResult);
    }

    private List<Venta> findVentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Venta.class));
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

    public Venta findVenta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Venta.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Venta> rt = cq.from(Venta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
