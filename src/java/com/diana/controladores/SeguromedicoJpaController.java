/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diana.controladores;

import com.diana.conexion.jpaConnection;
import com.diana.controladores.exceptions.NonexistentEntityException;
import com.diana.entidades.Seguromedico;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Oscar
 */
public class SeguromedicoJpaController implements Serializable {

    public SeguromedicoJpaController() {
    }

    public EntityManager getEntityManager() {
        return jpaConnection.getEntityManager();
    }

    public void create(Seguromedico seguromedico) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(seguromedico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Seguromedico seguromedico) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            seguromedico = em.merge(seguromedico);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = seguromedico.getIdSeguroMedico();
                if (findSeguromedico(id) == null) {
                    throw new NonexistentEntityException("The seguromedico with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Seguromedico seguromedico;
            try {
                seguromedico = em.getReference(Seguromedico.class, id);
                seguromedico.getIdSeguroMedico();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The seguromedico with id " + id + " no longer exists.", enfe);
            }
            em.remove(seguromedico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Seguromedico> findSeguromedicoEntities() {
        return findSeguromedicoEntities(true, -1, -1);
    }

    public List<Seguromedico> findSeguromedicoEntities(int maxResults, int firstResult) {
        return findSeguromedicoEntities(false, maxResults, firstResult);
    }

    private List<Seguromedico> findSeguromedicoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Seguromedico.class));
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

    public Seguromedico findSeguromedico(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Seguromedico.class, id);
        } finally {
            em.close();
        }
    }

    public int getSeguromedicoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Seguromedico> rt = cq.from(Seguromedico.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
