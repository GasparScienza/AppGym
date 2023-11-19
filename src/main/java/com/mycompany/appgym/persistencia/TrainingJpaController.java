package com.mycompany.appgym.persistencia;

import com.mycompany.appgym.logica.Training;
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

public class TrainingJpaController implements Serializable {

    public TrainingJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public TrainingJpaController(){
        emf = Persistence.createEntityManagerFactory("AppGymPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Training training) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(training);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Training training) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            training = em.merge(training);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = training.getId();
                if (findTraining(id) == null) {
                    throw new NonexistentEntityException("The training with id " + id + " no longer exists.");
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
            Training training;
            try {
                training = em.getReference(Training.class, id);
                training.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The training with id " + id + " no longer exists.", enfe);
            }
            em.remove(training);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Training> findTrainingEntities() {
        return findTrainingEntities(true, -1, -1);
    }

    public List<Training> findTrainingEntities(int maxResults, int firstResult) {
        return findTrainingEntities(false, maxResults, firstResult);
    }

    private List<Training> findTrainingEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Training.class));
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

    public Training findTraining(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Training.class, id);
        } finally {
            em.close();
        }
    }

    public int getTrainingCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Training> rt = cq.from(Training.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
