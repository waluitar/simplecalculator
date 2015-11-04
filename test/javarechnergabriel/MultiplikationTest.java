package javarechnergabriel;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Gabriel Kunzer
 */
public class MultiplikationTest {

    public MultiplikationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of berechne method, of class Multiplikation.
     */
    @Test
    public void testMultiplikationEinfach() {
        System.out.println("multipliziere kleine Double-Werte");
        double a = 2.0;
        double b = 4.0;
        Multiplikation instance = new Multiplikation();
        double result = instance.berechne(a, b);
        assertEquals(8.0, result, 0.0);
    }

    @Test
    public void testMultiplikationNegativ() {
        System.out.println("multipliziere negative Double-Werte");
        double a = -2.0;
        double b = -4.0;
        Multiplikation instance = new Multiplikation();
        double result = instance.berechne(a, b);
        assertEquals(8.0, result, 0.0);
    }

    @Test
    public void testMultiplikationMitNull() {
        System.out.println("multipliziere mit Null");
        double a = -2.0;
        double b = 0.0;
        Multiplikation instance = new Multiplikation();
        double result = instance.berechne(a, b);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testMultiplikationOutOfScope() {
        System.out.println("multipliziere außerhalb des Wertebereichs");
        double a = 1.7976931348623157E308;
        double b = 5;
        Multiplikation instance = new Multiplikation();
        double result = instance.berechne(a, b);
        assertEquals(1d / 0d, result, 0.0);
    }

}
