package com.mycompany.appgym.persistencia;

import com.mycompany.appgym.logica.Debt;
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

public class DebtJpaController implements Serializable {

    public DebtJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public DebtJpaController(){
        emf = Persistence.createEntityManagerFactory("AppGymPU");
    }

    public void create(Debt debt) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(debt);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Debt debt) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            debt = em.merge(debt);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = debt.getId();
                if (findDebt(id) == null) {
                    throw new NonexistentEntityException("The debt with id " + id + " no longer exists.");
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
            Debt debt;
            try {
                debt = em.getReference(Debt.class, id);
                debt.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The debt with id " + id + " no longer exists.", enfe);
            }
            em.remove(debt);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Debt> findDebtEntities() {
        return findDebtEntities(true, -1, -1);
    }

    public List<Debt> findDebtEntities(int maxResults, int firstResult) {
        return findDebtEntities(false, maxResults, firstResult);
    }

    private List<Debt> findDebtEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Debt.class));
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

    public Debt findDebt(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Debt.class, id);
        } finally {
            em.close();
        }
    }

    public int getDebtCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Debt> rt = cq.from(Debt.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
