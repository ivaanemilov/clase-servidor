/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.bll.commands.visita;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Iván Emilov Pashev - ivanemilov.pashev.alum@iescamp.es
 */
public class CommandVisitaLanding extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Salida
        String out = "visita/visita-landing";
        
        // Redireccion
        forward(out);
    }
    
    
    
}
