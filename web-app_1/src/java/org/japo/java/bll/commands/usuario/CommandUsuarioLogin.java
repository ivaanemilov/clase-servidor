/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.bll.commands.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Iván Emilov Pashev - ivanemilov.pashev.alum@iescamp.es
 */
public class CommandUsuarioLogin extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Salida
        String out = "usuario/usuario-login";

        // Operacion
        String op = request.getParameter("op");

        // Discriminacion de operacion
        if (op == null) {
            // Lanzar Formulario

        } else if (op.equals("captura")) {
            // Lanzar formulario
            
        } else if (op.equals("proceso")) {
            // Procesar formulario
            out = "message/credencial-correcta";
//            out = "message/credencial-incorrecta";
            
        } else {
            // Lanzar formulario
        }
        

        

        // Redireccion
        forward(out);
    }

}
