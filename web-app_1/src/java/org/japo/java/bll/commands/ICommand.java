
package org.japo.java.bll.commands;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Iván Emilov Pashev - ivanemilov.pashev.alum@iescamp.es
 */

public interface ICommand {
    
    
    void init(ServletConfig config,
            HttpServletRequest request,
            HttpServletResponse response);
    
    void process() throws ServletException, IOException;    
    
}
