package com.mycompany.appgym.persistencia;

import com.mycompany.appgym.logica.PriceList;
import com.mycompany.appgym.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class PriceListJpaController implements Serializable {

    public PriceListJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public PriceListJpaController(){
        emf = Persistence.createEntityManagerFactory("AppGymPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PriceList priceList) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(priceList);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PriceList priceList) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            priceList = em.merge(priceList);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = priceList.getId();
                if (findPriceList(id) == null) {
                    throw new NonexistentEntityException("The priceList with id " + id + " no longer exists.");
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
            PriceList priceList;
            try {
                priceList = em.getReference(PriceList.class, id);
                priceList.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The priceList with id " + id + " no longer exists.", enfe);
            }
            em.remove(priceList);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PriceList> findPriceListEntities() {
        return findPriceListEntities(true, -1, -1);
    }

    public List<PriceList> findPriceListEntities(int maxResults, int firstResult) {
        return findPriceListEntities(false, maxResults, firstResult);
    }

    private List<PriceList> findPriceListEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PriceList.class));
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

    public PriceList findPriceList(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PriceList.class, id);
        } finally {
            em.close();
        }
    }

    public int getPriceListCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PriceList> rt = cq.from(PriceList.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
