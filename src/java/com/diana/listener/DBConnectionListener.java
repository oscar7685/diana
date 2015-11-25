/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diana.listener;

import com.diana.conexion.jpaConnection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author Oscar
 */
@WebListener()
public class DBConnectionListener implements ServletContextListener {

    private ServletContext servletContext;
    private Context ctx;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            ctx = new InitialContext();
            jpaConnection.createEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se puede obtener la fuente de datos++++++++++++++++++++++++++++++");
            servletContext.log("No se puede obtener la fuente de datos ", e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed++++++++++++++++++++++++++++++++++++++++++");
    }
}
