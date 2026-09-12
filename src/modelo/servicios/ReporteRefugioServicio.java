package modelo.servicios;

import modelo.Mascota;

public class ReporteRefugioServicio {

    public String generarResumen(Mascota[] mascotas) {
        int total = mascotas.length;
        int adoptadas = 0;
        for (Mascota mascota : mascotas) {
            if (mascota.isAdoptada()) {
                adoptadas++;
            }
        }
        int disponibles = total - adoptadas;
        return "Total: " + total + " | Adoptadas: " + adoptadas + " | Disponibles: " + disponibles;
    }

    public String generarDetalle(Mascota mascota) {
        if (mascota == null) {
            return "Mascota no disponible";
        }
        return "ID: " + mascota.getIdentificacion() + " | Nombre: "
                + mascota.getNombre() + " | Tipo: " + mascota.getTipo();
    }
}