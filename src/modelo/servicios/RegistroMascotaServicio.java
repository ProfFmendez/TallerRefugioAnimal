package modelo.servicios;

import modelo.Mascota;

/**
 * Servicio para registrar nuevas mascotas en el refugio.
 *
 * Proporciona métodos para:
 * - Agregar una nueva mascota al refugio
 * - Contar cuántas mascotas están registradas
 *
 * Concepto: CRUD - CREATE
 * Este servicio implementa la operación CREATE (Crear) del patrón CRUD.
 *
 * @author franc
 */
public class RegistroMascotaServicio {

    /**
     * Agrega una nueva mascota al array del refugio.
     *
     * El método busca el primer espacio disponible (null) en el array y coloca
     * la nueva mascota ahí. Si el array está lleno, retorna false.
     *
     * Algoritmo:
     * 1. Validar que el array y la mascota no sean null
     * 2. Recorrer el array
     * 3. Encontrar la primera posición null (espacio disponible)
     * 4. Colocar la mascota en esa posición
     * 5. Retornar true
     * 6. Si no hay espacio, retornar false
     *
     * Ejemplo de uso:
     *   RegistroMascotaServicio servicio = new RegistroMascotaServicio();
     *   Perro nuevo = new Perro(200, "Firulais", 3, 15, 120, false, false, "Criollo");
     *   boolean registrado = servicio.agregar(mascotas, nuevo);
     *
     *   if (registrado) {
     *       System.out.println("Perro registrado exitosamente");
     *       System.out.println("Total de mascotas: " + servicio.contarEspaciosDisponibles(mascotas));
     *   } else {
     *       System.out.println("No hay espacio disponible en el refugio");
     *   }
     *
     * @param mascotas array donde se registrarán las mascotas
     * @param nuevaMascota la mascota a registrar
     * @return true si se agregó correctamente, false si no hay espacio disponible
     */
    public boolean agregar(Mascota[] mascotas, Mascota nuevaMascota) {
        if(mascotas != null & nuevaMascota != null){
            // Recorrer el array mascotas}
            for (int i = 0; i <= mascotas.length; i++) {
                // Encontrar la primera posición donde mascotas[i] == null
                if(mascotas[i] == null){
                    // Asignar mascotas[i] = nuevaMascota
                    mascotas[i] = nuevaMascota;
                    // Retornar true
                    return true;
                }
            }
            //Si no encuentra espacio null, retornar false
            return false;     
        }  
        return false;
    }

    /**
     * Cuenta cuántas mascotas están registradas en el refugio.
     *
     * Cuenta todas las posiciones del array que no son null.
     *
     * Ejemplo de uso:
     *   RegistroMascotaServicio servicio = new RegistroMascotaServicio();
     *   int total = servicio.contarEspaciosDisponibles(mascotas);
     *   System.out.println("Mascotas registradas: " + total);
     *
     *   int espacioLibre = mascotas.length - total;
     *   System.out.println("Espacio disponible: " + espacioLibre);
     *
     * @param mascotas array de mascotas
     * @return cantidad de mascotas no-null (registradas)
     */
    public int contarEspaciosDisponibles(Mascota[] mascotas) {
        // Validación: si el array es null, no hay mascotas
        if (mascotas == null) {
            return 0;
        }
        
        // Recorrer el array y contar las posiciones no-null
        int cantidad = 0;
        for (Mascota mascota : mascotas) {
            if (mascota == null) {
                cantidad++;
            }
        }
        return cantidad;
    }
}