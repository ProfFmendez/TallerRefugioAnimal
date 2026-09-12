package modelo.servicios;

import modelo.Mascota;

/**
 * Servicio para eliminar mascotas del registro del refugio.
 *
 * Concepto: CRUD - DELETE
 * Este servicio implementa la operación DELETE (Eliminar) del patrón CRUD.
 *
 * Nota importante:
 * La eliminación "lógica" (establecer en null) es diferente a borrado físico.
 * La mascota se elimina del refugio pero su dato no se pierda totalmente.
 *
 * @author franc
 */
public class EliminacionMascotaServicio {

    /**
     * Elimina una mascota del registro del refugio por su ID.
     *
     * @param mascotas array de mascotas
     * @param id identificación de la mascota a eliminar
     * @return la mascota eliminada, o null si no existe
     */
    public Mascota eliminarPorId(Mascota[] mascotas, int id) {

        if (mascotas == null) {
            return null;
        }

        for (int i = 0; i < mascotas.length; i++) {

            if (mascotas[i] != null
                    && mascotas[i].getIdentificacion() == id) {

                Mascota eliminada = mascotas[i];

                mascotas[i] = null;

                return eliminada;
            }
        }

        return null;
    }

    /**
     * Cuenta el total de mascotas registradas en el refugio.
     *
     * @param mascotas array de mascotas
     * @return cantidad de mascotas no-null (registradas)
     */
    public int contarMascotasRegistradas(Mascota[] mascotas) {

        if (mascotas == null) {
            return 0;
        }

        int cantidad = 0;

        for (Mascota mascota : mascotas) {

            if (mascota != null) {
                cantidad++;
            }
        }

        return cantidad;
    }
}