package modelo.servicios;

/**
 *
 * @author franc
 */
public class AsignacionJaulaServicio {

    public String buscarUbicacion(int[][] mapa, int numeroJaula) {
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int columna = 0; columna < mapa[fila].length; columna++) {
                if (mapa[fila][columna]==numeroJaula) {
                    return "Fila " + fila + ", " + "columna " + columna;
                }
            }//for columna
        }//for fila
        return "No encontrada";
    }

    public boolean existeJaula(int[][] mapa, int numeroJaula) {
        if (mapa == null) {
            return false;
        }
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int columna = 0; columna < mapa[fila].length; columna++) {
                if (mapa[fila][columna] == numeroJaula) {
                    return true;
                }
            }
        }
        return false;
    }
}
