package modelo.servicios;

import modelo.Mascota;

/**
 * Servicio para buscar mascotas utilizando búsqueda lineal.
 *
 * ¿Qué es búsqueda lineal?
 * Un algoritmo simple que recorre el array elemento por elemento hasta encontrar
 * lo que buscas o llegar al final. También se conoce como "búsqueda secuencial".
 *
 * Complejidad: O(n) - Lineal
 * En el peor caso, debe revisar todos los n elementos del array.
 *
 * Ventajas:
 * - Funciona con arrays desordenados
 * - Simple de entender e implementar
 * - Bueno para arrays pequeños
 *
 * Desventajas:
 * - Lento para arrays muy grandes
 * - Para 1,000,000 de elementos, máximo 1,000,000 de comparaciones
 *
 * Alternativa más rápida:
 * Ver BusquedaBinariaServicio (O(log n)) - pero requiere array ordenado.
 *
 * @author franc
 * @see BusquedaBinariaServicio para búsqueda más rápida
 */
public class BusquedaLinealServicio {

    /**
     * Busca una mascota por su identificación usando búsqueda lineal.
     *
     * Algoritmo:
     * 1. Recorrer el array de mascotas una por una
     * 2. Para cada mascota, verificar si no es null y su ID coincide
     * 3. Si coincide, retornar la mascota (ENCONTRADA)
     * 4. Si termina el loop, retornar null (NO ENCONTRADA)
     *
     * Visualización:
     *   Array: [M(101), M(102), M(103), null, M(105)]
     *   Buscar: 103
     *
     *   Paso 1: ¿101 == 103? No
     *   Paso 2: ¿102 == 103? No
     *   Paso 3: ¿103 == 103? Sí → RETORNAR M(103)
     *
     * Ejemplo de uso:
     *   BusquedaLinealServicio servicio = new BusquedaLinealServicio();
     *   Mascota encontrada = servicio.buscarPorId(mascotas, 108);
     *
     *   if (encontrada != null) {
     *       System.out.println("Mascota: " + encontrada.getNombre());
     *       System.out.println("Tipo: " + encontrada.getTipo());
     *   } else {
     *       System.out.println("No existe mascota con ID 108");
     *   }
     *
     * @param mascotas array de mascotas donde buscar
     * @param id identificación a buscar
     * @return la mascota encontrada, o null si no existe
     */
    public Mascota buscarPorId(Mascota[] mascotas, int id) {
        // TODO ESTUDIANTE 04: implementar la búsqueda lineal por ID.
        // Pasos:
        // 1. Recorrer el array mascotas
        // 2. Para cada mascota:
        //    - Verificar que NO sea null
        //    - Verificar que su getIdentificacion() == id
        // 3. Si ambas condiciones son true, RETORNAR la mascota
        // 4. Si termina el loop sin encontrar, RETORNAR null
        
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i] != null) {
                if (mascotas[i].getIdentificacion() == id) {
                    return mascotas[i];
                }
            }
        }
        return null;
    }

    /**
     * Busca una mascota por su nombre usando búsqueda lineal.
     *
     * Similar a buscarPorId() pero compara nombres en lugar de IDs.
     *
     * Ejemplo de uso:
     *   BusquedaLinealServicio servicio = new BusquedaLinealServicio();
     *   Mascota luna = servicio.buscarPorNombre(mascotas, "Luna");
     *
     *   if (luna != null) {
     *       System.out.println("Encontrada: " + luna.getNombre());
     *       System.out.println("Costo mensual: $" + luna.calcularCostoMensual());
     *   }
     *
     * @param mascotas array de mascotas donde buscar
     * @param nombre nombre a buscar
     * @return la mascota encontrada, o null si no existe
     */
    public Mascota buscarPorNombre(Mascota[] mascotas, String nombre) {
        // Validación: si el array o nombre son null, no hay búsqueda posible
        if (mascotas == null || nombre == null) {
            return null;
        }
        
        // Búsqueda lineal: recorrer cada mascota
        for (Mascota mascota : mascotas) {
            // Verificar que no sea null y que el nombre coincida
            
            
            
            if (mascota != null && mascota.getNombre().equals(nombre)) {
                return mascota;  // Encontrada
            }
        }
        
        // No encontrada
        return null;
    }
}
