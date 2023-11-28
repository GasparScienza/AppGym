/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appgym.persistencia;

import com.mycompany.appgym.logica.AlEntr;
import com.mycompany.appgym.logica.Alumno;
import com.mycompany.appgym.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

/**
 *
 * @author Gasparcitoh
 */
public class AlEntrJpaController implements Serializable {

    public AlEntrJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public AlEntrJpaController(){
        emf = Persistence.createEntityManagerFactory("AppGymPU");
    }
    public List<AlEntr> findAlELetra(String letra) {
        EntityManager em = emf.createEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<AlEntr> query = cb.createQuery(AlEntr.class);
            Root<AlEntr> root = query.from(AlEntr.class);

            // En este caso, asumiré que AlEntr tiene un atributo llamado "alumno" de tipo Alumno
            Join<AlEntr, Alumno> alumnoJoin = root.join("alu");

            query.where(cb.like(cb.lower(alumnoJoin.get("name")), letra.toLowerCase() + "%"));

            return em.createQuery(query).getResultList();
        } finally {
            em.close();
        }
    }

    public void create(AlEntr alEntr) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alEntr);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(AlEntr alEntr) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            alEntr = em.merge(alEntr);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = alEntr.getId();
                if (findAlEntr(id) == null) {
                    throw new NonexistentEntityException("The alEntr with id " + id + " no longer exists.");
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
            AlEntr alEntr;
            try {
                alEntr = em.getReference(AlEntr.class, id);
                alEntr.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The alEntr with id " + id + " no longer exists.", enfe);
            }
            em.remove(alEntr);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<AlEntr> findAlEntrEntities() {
        return findAlEntrEntities(true, -1, -1);
    }

    public List<AlEntr> findAlEntrEntities(int maxResults, int firstResult) {
        return findAlEntrEntities(false, maxResults, firstResult);
    }

    private List<AlEntr> findAlEntrEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(AlEntr.class));
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

    public AlEntr findAlEntr(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(AlEntr.class, id);
        } finally {
            em.close();
        }
    }

    public int getAlEntrCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<AlEntr> rt = cq.from(AlEntr.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
