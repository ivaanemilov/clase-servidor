
package org.japo.java.bll.commands;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Iván Emilov Pashev - ivanemilov.pashev.alum@iescamp.es
 */

public interface ICommand {
    
    ICommand obtenerComando(String cmdName);
    
    void init(ServletConfig config,
            HttpServletRequest request,
            HttpServletResponse response);
    
    void process();    
    
}
