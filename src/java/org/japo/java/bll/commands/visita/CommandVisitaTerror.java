package org.japo.java.bll.commands.visita;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Ivan Emilov Pashev <ivaaan.bulgaria@gmail.com>
 */
public class CommandVisitaTerror extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Nombre Salida

        String out = "visita/visita-terror";

        // Redireccion
        forward(out);

    }

}
