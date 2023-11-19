package com.mycompany.appgym.persistencia;

import com.mycompany.appgym.logica.Frequency;
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


public class FrequencyJpaController implements Serializable {

    public FrequencyJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public FrequencyJpaController(){
        emf = Persistence.createEntityManagerFactory("AppGymPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Frequency frequency) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(frequency);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Frequency frequency) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            frequency = em.merge(frequency);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = frequency.getId();
                if (findFrequency(id) == null) {
                    throw new NonexistentEntityException("The frequency with id " + id + " no longer exists.");
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
            Frequency frequency;
            try {
                frequency = em.getReference(Frequency.class, id);
                frequency.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The frequency with id " + id + " no longer exists.", enfe);
            }
            em.remove(frequency);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Frequency> findFrequencyEntities() {
        return findFrequencyEntities(true, -1, -1);
    }

    public List<Frequency> findFrequencyEntities(int maxResults, int firstResult) {
        return findFrequencyEntities(false, maxResults, firstResult);
    }

    private List<Frequency> findFrequencyEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Frequency.class));
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

    public Frequency findFrequency(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Frequency.class, id);
        } finally {
            em.close();
        }
    }

    public int getFrequencyCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Frequency> rt = cq.from(Frequency.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
