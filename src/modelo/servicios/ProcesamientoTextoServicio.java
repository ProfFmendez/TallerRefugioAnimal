package modelo.servicios;

/**
 *
 * @author franc
 */
public class ProcesamientoTextoServicio {

    public String normalizarNombre(String nombre) {
        // TODO ESTUDIANTE 14: implementar la normalización del nombre.

        for (int i = 0; i < palabras.length; i++) {
    String palabra = palabras[i];
    
    if (palabra != null && !palabra.isEmpty()) {
        
        palabras[i] = palabra.substring(0, 1).toUpperCase() 
                    + palabra.substring(1).toLowerCase();
    }
}





        return "";
    }

    public String obtenerIniciales(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.trim().equals("")) {
            return "";
        }
        String[] partes = nombreCompleto.trim().split(" ");
        String iniciales = "";
        for (String parte : partes) {
            if (!parte.equals("")) {
                iniciales += parte.substring(0, 1).toLowerCase();
            }
        }
        return iniciales;
    }
}//fin clase
