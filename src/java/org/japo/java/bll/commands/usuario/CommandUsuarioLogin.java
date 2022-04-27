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
public class CommandUsuarioLogin extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Nombre Salida
        String out;

        // Validar Usuario YA Identificado
        if (validarSesion(request)) {
            out = UtilesUsuarios.obtenerComandoVistaPrincipal(request);
        } else {
            //Operacion
            String op = request.getParameter("op");

            // Discriminacion de Operacion
            if (op == null || op.equals("captura")) {
                // Lanzar el formulario
                out = "usuario/usuario-login";
            } else if (op.equals("proceso")) {

                // Entrada + BD > Usuario
                Usuario usuario = UtilesUsuarios.obtenerUsuarioRequest(config, request);

                // Validar Usuario 
                if (usuario == null) {
                    out = "message/acceso-denegado";
                } else {
                    // Regenerar Sesion
                    HttpSession sesion = UtilesUsuarios.reiniciarSesion(config, request);

                    // Usuario > Sesion 
                    sesion.setAttribute("usuario", usuario);

                    // Usuario + perfil > Salida
                    out = UtilesUsuarios.obtenerComandoVistaPrincipal(request);

                }

            } else {
                out = "message/operacion-desconocida";
            }
        }

        // Redireccion
        forward(out);

    }

}
