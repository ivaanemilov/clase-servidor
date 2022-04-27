package org.japo.java.entities;

import java.io.Serializable;
import org.japo.java.libraries.UtilesPerfiles;

/**
 *
 * @author Ivan Emilov Pashev <ivaaan.bulgaria@gmail.com>
 */
public final class Perfil implements Serializable {

    // Campos
    private int id;
    private String nombre;
    private String info;

    public Perfil() {
        id = UtilesPerfiles.DEF_ID;
        nombre = UtilesPerfiles.DEF_NOMBRE;
        info = UtilesPerfiles.DEF_INFO;

    }

    public Perfil(int id, String nombre, String info) {
        if (validarId()) {
            this.id = id;
        } else {
            this.id = UtilesPerfiles.DEF_ID;
        }
        if (validarNombre()) {
            this.nombre = nombre;
        } else {
            this.nombre = UtilesPerfiles.DEF_NOMBRE;
        }
        if (validarInfo()) {
            this.info = info;
        } else {
            this.info = UtilesPerfiles.DEF_INFO;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (validarId()) {
            this.id = id;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (validarNombre()) {
            this.nombre = nombre;
        }
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        if (validarInfo()) {
            this.info = info;
        }
    }

    private boolean validarId() {
        return UtilesPerfiles.validarId(id);
    }

    private boolean validarNombre() {
        return UtilesPerfiles.validarNombre(nombre);
    }

    private boolean validarInfo() {
        return UtilesPerfiles.validarInfo(info);

    }

}
