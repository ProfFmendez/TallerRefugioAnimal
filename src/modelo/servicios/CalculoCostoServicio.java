package modelo.servicios;

import modelo.Mascota;

/**
 * Servicio para calcular costos de mantenimiento de mascotas.
 *
 * Proporciona métodos para:
 * - Calcular el costo total del refugio
 * - Calcular el costo promedio por mascota
 *
 * Concepto: POLIMORFISMO en acción
 * Este servicio demuestra cómo el polimorfismo simplifica el código.
 * Cada tipo de mascota (Perro, Gato, Conejo) tiene su propia fórmula de costo,
 * pero el servicio utiliza el mismo método para todas.
 *
 * @author franc
 */
public class CalculoCostoServicio {

    /**
     * Calcula el costo mensual total de mantener todas las mascotas no adoptadas.
     *
     * Lógica:
     * - Recorre todas las mascotas
     * - Solo cuenta mascotas no adoptadas (las adoptadas se fueron)
     * - Suma el costo de cada una usando calcularCostoMensual()
     * - Retorna el total
     *
     * Ejemplo de polimorfismo:
     *   Mascota[] mascotas = {
     *       new Perro(1, "Luna", 4, 20, 101, false, true, "Mestizo"),    // 22000
     *       new Gato(2, "Milo", 2, 4, 102, false, false, true),          // 15500
     *       new Conejo(3, "Nube", 1, 2, 103, false, true, "Blanco"),     // 9000
     *       new Perro(4, "Max", 7, 26, 104, true, true, "Labrador")      // ADOPTADO (no cuenta)
     *   };
     *
     *   CalculoCostoServicio calculo = new CalculoCostoServicio();
     *   double total = calculo.calcularCostoTotal(mascotas);
     *   // total = 22000 + 15500 + 9000 = 46500
     *   // Max no se cuenta porque está adoptado
     *
     * Ejemplo de uso:
     *   CalculoCostoServicio servicio = new CalculoCostoServicio();
     *   double costoTotal = servicio.calcularCostoTotal(mascotas);
     *   System.out.println("Costo total mensual: $" + costoTotal);
     *
     * @param mascotas array de mascotas del refugio
     * @return costo total mensual en pesos de todas las mascotas no adoptadas
     */
    public double calcularCostoTotal(Mascota[] mascotas) {
        // TODO ESTUDIANTE 12: implementar el cálculo del costo total.
        // Pasos:
        // 1. Inicializar total = 0
        // 2. Recorrer todas las mascotas
        // 3. Para cada mascota:
        //    - Verificar que NO sea null
        //    - Verificar que NO está adoptada (isAdoptada() == false)
        // 4. Si ambas son verdad, sumar mascota.calcularCostoMensual() al total
        // 5. Retornar total
  
        double total = 0;
        for (Mascota mascota : mascotas) {
            if (mascotas != null && !mascota.isAdoptada()) {
                total = mascota.calcularCostoMensual();
            }
        }
        return total;
    }

    /**
     * Calcula el costo promedio por mascota no adoptada.
     *
     * Fórmula: Costo Promedio = Costo Total / Cantidad de Mascotas
     *
     * Ejemplo:
     *   Si hay 3 mascotas no adoptadas con costos: 22000, 15500, 9000
     *   Total = 46500
     *   Cantidad = 3
     *   Promedio = 46500 / 3 = 15500
     *
     * @param mascotas array de mascotas del refugio
     * @return costo promedio mensual por mascota en pesos
     */
    public double calcularCostoPromedio(Mascota[] mascotas) {
        // Validación: si el array es null, no hay promedio
        if (mascotas == null) {
            return 0;
        }
  
        // Variables para acumular datos
        int cantidad = 0;
        double total = 0;

        // Recorrer todas las mascotas
        for (Mascota mascota : mascotas) {
            // Contar total de mascotas (null o no)
            if (mascota != null && !mascota.isAdoptada()) {
                cantidad++;
            }

            // Sumar costo solo si existe Y no está adoptada
            if (mascota != null && !mascota.isAdoptada()) {
                total += mascota.calcularCostoMensual();
            }
        }

        // Evitar división por cero
        if (cantidad == 0) {
            return 0;
        }

        // Retornar el promedio
        return total / cantidad;
    }
}