package org.japo.java.libraries;

/**
 *
 * @author Iván Emilov Pashev - ivanemilov.pashev.alum@iescamp.es
 */
public final class UtilesFormato {

    private UtilesFormato() {
    }
    
    
    //    String camel = Pattern.compile("-(.)")
//            .matcher(kebab)
//            .replaceAll(mr -> mr.group(1).toUpperCase());

    public static final String cambiarKebab2Camel(String str) {
        // String > String []
        String[] items = str.split("-");

        // Buffer String
        StringBuilder sb = new StringBuilder();

        // Bucle
        for (String item : items) {
            sb.append(capitalizar(item));
        }

        return sb.toString();

    }

    public static final String capitalizar(String item) {
        if (item != null) {
            // Item > inicial mayuscula
            char head = Character.toUpperCase(item.charAt(0));

            // Item > Resto Cadena Minuscula
            String tail = item.substring(1).toLowerCase();

            // head + tail
            item = head + tail;
        }

        return item;
    }

}
