/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diana.conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Marco Gonzalez
 *
 */
public final class jpaConnection {

    private static EntityManagerFactory emf;

    public static void createEntityManagerFactory() {

        try {
            emf = Persistence.createEntityManagerFactory("dianaPU");
            // System.out.println("N O T A: EMF CREADO");
        } catch (Exception e) {
            System.out.println("No se puede obtener la fuente de datos2++++++++++++++++++++++++++++++");
            System.err.println("E R R O R: ERROR AL CREAR EMF");
        }

    }

    public static EntityManager getEntityManager() {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            // System.out.println("N O T A: EM CREADO");
        } catch (Exception e) {
            System.err.println("E R R O R:  ERROR AL CREAR EM");
        }
        return em;

    }
}
