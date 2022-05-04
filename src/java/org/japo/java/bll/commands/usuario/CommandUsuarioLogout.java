package org.japo.java.bll.commands.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import org.japo.java.bll.commands.Command;
import org.japo.java.entities.Usuario;
import org.japo.java.libraries.UtilesUsuarios;

/**
 *
 * @author Ivan Emilov Pashev <ivaaan.bulgaria@gmail.com>
 */
public class CommandUsuarioLogout extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Nombre Salida
        String out="controller?cmd=usuario-login";

        // Validar Usuario YA Identificado
        if (validarSesion(request)) {
            // Cierre Artefactos Externos
            // ---
            
            
            // Requet > session
            HttpSession sesion = request.getSession(false);
            
            // Cerrar Session Actual
            sesion.invalidate();
            
            
        } 
        // Redireccion
        forward(out);

    }

}
