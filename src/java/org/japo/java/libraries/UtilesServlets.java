/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.sql.DataSource;

/**
 *
 * @author Iván Emilov Pashev - ivanemilov.pashev.alum@iescamp.es
 */
public final class UtilesServlets {
    
    // Lapso Inactividad por Defecto
    private static final int DEF_LAPSO = 1800;
    

    private UtilesServlets() {
    }

    public static DataSource obtenerDataSource(ServletConfig config) {
        // dataSource
        DataSource ds;

        try {
            // Contexto Inicial Nombres JNDI
            Context iniCtx = new InitialContext();

            // Situar el contexto inicial
            Context envCtx = (Context) iniCtx.lookup("java:/comp/env");

            // Contexto inicial > DataSource
            ds = (DataSource) envCtx.lookup("jdbc/" + obtenerNombreBD(config));

        } catch (NamingException ex) {
            ds = null;
        }

        return ds;
    }

    private static String obtenerNombreBD(ServletConfig config) {
        // Parametrto de contexto (web.xml)
        String paramName = "base-datos";

        // Servlet Config
        ServletContext context = config.getServletContext();

        // Retorno: Nombre Base de Datos
        return context.getInitParameter(paramName);
    }

    public static final int obtenerLapsoInactividad(ServletConfig config) {
        // Tiempo maximo de Inactividad de sesion
        int lapso;

        // Nombre del Parametro
        String paramName = "lapso-inactividad";

        // Contexto de la App
        ServletContext context = config.getServletContext();

        // Contexto > Valor Parametro
        String paramValue = context.getInitParameter(paramName);

        try {
            // String > int
            lapso = Integer.parseInt(paramName);
        } catch (NumberFormatException e) {
            lapso = DEF_LAPSO;
        }

        // Retorno
        return lapso;

    }

}
