/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appgym.persistencia;

import com.mycompany.appgym.logica.AlEntr;
import com.mycompany.appgym.logica.Alumno;

import com.mycompany.appgym.logica.Frequency;
import com.mycompany.appgym.logica.Pago;
import com.mycompany.appgym.logica.PriceList;
import com.mycompany.appgym.logica.Training;
import com.mycompany.appgym.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author Gasparcitoh
 */
public class PagoJpaController implements Serializable {

    public PagoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public PagoJpaController(){
        emf = Persistence.createEntityManagerFactory("AppGymPU");
    }
    
    public Pago obtenerUltimoPagoPorAlumno(int idAlumno) {
        EntityManager em = getEntityManager();

        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Pago> cq = cb.createQuery(Pago.class);
            Root<Pago> pagoRoot = cq.from(Pago.class);
            Join<Pago, Alumno> alumnoJoin = pagoRoot.join("alE"); // Reemplaza "alE" con el nombre real de la asociación

            cq.select(pagoRoot)
                    .where(cb.equal(alumnoJoin.get("id"), idAlumno))
                    .orderBy(cb.desc(pagoRoot.get("date")));

            List<Pago> resultados = em.createQuery(cq)
                    .setMaxResults(1)
                    .getResultList();

            return resultados.isEmpty() ? null : resultados.get(0);
        } finally {
            em.close();
        }
    }
    
    public List<Pago> findPagoEntities(AlEntr al) {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Pago> cq = cb.createQuery(Pago.class);
            Root<Pago> pago = cq.from(Pago.class);

            // Añade una condición para filtrar por el alumno específico
            cq.where(cb.equal(pago.get("alE"), al));

            TypedQuery<Pago> query = em.createQuery(cq);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    public List<PriceList> findListPriceByTrainingAndFrequency(Training entrenamiento, Frequency frecuencia) {
       EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<PriceList> query = cb.createQuery(PriceList.class);
            Root<PriceList> root = query.from(PriceList.class);

            // Agregar condiciones para entrenamiento y frecuencia
            Predicate condition = cb.and(
                cb.equal(root.get("en"), entrenamiento),
                cb.equal(root.get("frec"), frecuencia)
            );
            query.where(condition);

            return em.createQuery(query).getResultList();
        } finally {
            em.close();
        } 
    }

    public void create(Pago pago) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pago);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pago pago) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pago = em.merge(pago);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = pago.getId();
                if (findPago(id) == null) {
                    throw new NonexistentEntityException("The pago with id " + id + " no longer exists.");
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
            Pago pago;
            try {
                pago = em.getReference(Pago.class, id);
                pago.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pago with id " + id + " no longer exists.", enfe);
            }
            em.remove(pago);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pago> findPagoEntities() {
        return findPagoEntities(true, -1, -1);
    }

    public List<Pago> findPagoEntities(int maxResults, int firstResult) {
        return findPagoEntities(false, maxResults, firstResult);
    }

    private List<Pago> findPagoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pago.class));
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

    public Pago findPago(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pago.class, id);
        } finally {
            em.close();
        }
    }

    public int getPagoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pago> rt = cq.from(Pago.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
