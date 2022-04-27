package org.japo.java.bll.commands.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Ivan Emilov Pashev <ivaaan.bulgaria@gmail.com>
 */
public class CommandUsuarioRegistro extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Nombre Salida

        String out = "usuario/usuario-registro";

        // Redireccion
        forward(out);

    }

}
