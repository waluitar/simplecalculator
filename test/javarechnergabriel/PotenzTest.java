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
public class PotenzTest {

    public PotenzTest() {
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
     * Test of berechne method, of class Potenz.
     */
    @Test
    public void testPotenziereKleinDouble() {
        System.out.println("einfache Potenz kleiner Double Werte");
        double a = 2.0;
        double b = 3.0;
        Potenz instance = new Potenz();
        double result = instance.berechne(a, b);
        assertEquals(8, result, 0.0);
    }

    @Test
    public void testPotenziereGroßeWerte() {
        System.out.println("einfache Potenz großer Double Werte");
        double a = 5454865468486848.21;
        double b = 5465486461654545.54;
        Potenz instance = new Potenz();
        double result = instance.berechne(a, b);
        assertEquals(1d / 0d, result, 0.0); //Infinity darstellen
    }

    @Test
    public void testPotenziereNull() {
        System.out.println("erste Stelle 0");
        double a = 0;
        double b = 3.0;
        Potenz instance = new Potenz();
        double result = instance.berechne(a, b);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testPotenziereNegativeZahlen() {
        System.out.println("Potenz mit negativen Zahlen");
        double a = -2.0;
        double b = -4.0;
        Potenz instance = new Potenz();
        double result = instance.berechne(a, b);
        assertEquals(0.0625, result, 0.0);
    }
}
