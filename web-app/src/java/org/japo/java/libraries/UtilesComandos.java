/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.japo.java.bll.commands.ICommand;

/**
 *
 * @author Iván Emilov Pashev - ivanemilov.pashev.alum@iescamp.es
 */
public class UtilesComandos {

    public static void procesar(
            ServletConfig config,
            HttpServletRequest request,
            HttpServletResponse response) {
        // Request > Nombre del Comando
        String cmdName = request.getParameter("cmd");
        
        // Nombre del Comando > Objeto Comando
//        ICommand cmd = obtenerComando(cmdName);
        
        // Objeto Comando > Inicializar
//        cmd.init(config, request, response);
        
        // Procesar Comando 
//        cmd.process();
        
    }
    
}
