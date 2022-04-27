package org.japo.java.dll.usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.sql.DataSource;
import org.japo.java.entities.Usuario;
import org.japo.java.libraries.UtilesServlets;

/**
 *
 * @author Ivan Emilov Pashev <ivaaan.bulgaria@gmail.com>
 */
public final class DLLUsuario {

    // Acceso a la bbdd (Pool de conexiones)
    private final DataSource ds;

    public DLLUsuario(ServletConfig config) {
        ds = UtilesServlets.obtenerDataSource(config);
    }

    public final Usuario consultar(String user) {
        // Referencia
        Usuario usuario = null;

        // SQL
        String sql = ""
                + "SELECT "
                + "usuarios.id AS id, "
                + "usuarios.user AS user, "
                + "usuarios.pass AS pass, "
                + "usuarios.avatar AS avatar, "
                + "usuarios.perfil AS perfil, "
                + "perfiles.info AS perfil_info "
                + "FROM "
                + "usuarios "
                + "INNER JOIN "
                + "perfiles ON perfiles.id = usuarios.perfil "
                + "WHERE "
                + "usuarios.user=?";

        // Busqueda
        try {

            try (
                    Connection conn = ds.getConnection();
                    PreparedStatement ps = conn.prepareStatement(sql);) {

                // Parametrizar la sentencia
                ps.setString(1, user);

                // BD > Lista de Entidades
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        int id = rs.getInt("id");
                        String pass = rs.getString("pass");
                        String avatar = rs.getString("avatar");
                        int perfil = rs.getInt("perfil");
                        String perfilInfo = rs.getString("perfil_info");

                        usuario = new Usuario(id, user, pass, avatar, perfil, perfilInfo);
                    }
                }
            }

        } catch (SQLException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

        //Return
        return usuario;
    }

}
