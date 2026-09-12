package modelo.servicios;

import modelo.DatosIniciales;
import modelo.Mascota;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author franc
 */
public class CalculoCostoServicioTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void costoTotalUsaPolimorfismoYExcluyeAdoptadas() {
        Mascota[] datos = DatosIniciales.crearMascotas();
        assertEquals(153400.0, new CalculoCostoServicio().calcularCostoTotal(datos), 0.001);
    }

    @Test
    public void costoPromedioDivideEntreDisponibles() {
        Mascota[] datos = DatosIniciales.crearMascotas();
        assertEquals(15340.0, new CalculoCostoServicio().calcularCostoPromedio(datos), 0.001);
    }

    /**
     * Test of calcularCostoTotal method, of class CalculoCostoServicio.
     */
    @Test
    public void testCalcularCostoTotal() {
        System.out.println("calcularCostoTotal");
        Mascota[] mascotas = null;
        CalculoCostoServicio instance = new CalculoCostoServicio();
        double expResult = 0.0;
        double result = instance.calcularCostoTotal(mascotas);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCostoPromedio method, of class CalculoCostoServicio.
     */
    @Test
    public void testCalcularCostoPromedio() {
        System.out.println("calcularCostoPromedio");
        Mascota[] mascotas = null;
        CalculoCostoServicio instance = new CalculoCostoServicio();
        double expResult = 0.0;
        double result = instance.calcularCostoPromedio(mascotas);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
