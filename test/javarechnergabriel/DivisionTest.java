package javarechnergabriel;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Gabriel Kunzer
 */
public class DivisionTest {

    public DivisionTest() {
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
     * Test of berechne method, of class Division.
     */
    @Test
    public void testDivisionEinfach() {
        System.out.println("Einfaches dividieren");
        double a = 8.0;
        double b = 2.0;
        Division instance = new Division();
        double result = instance.berechne(a, b);
        assertEquals(4.0, result, 0.0);
    }

    @Test
    public void testDivisionGroßeZahlen() {
        System.out.println("Große Zahlen dividieren");
        double a = 8888888888888888.0;
        double b = 4444444444444444.0;
        Division instance = new Division();
        double result = instance.berechne(a, b);
        assertEquals(2.0, result, 0.0);
    }

    @Test
    public void testDivisionDividendNull() {
        System.out.println("Division von Dividenden = 0");
        double a = 0.0;
        double b = 4.0;
        Division instance = new Division();
        double result = instance.berechne(a, b);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testDivisionDivisorNull() {
        System.out.println("Division von Divisor = 0");
        double a = 4.0;
        double b = 0.0;
        Division instance = new Division();
        double result = instance.berechne(a, b);
        assertEquals(-1.0, result, 0.0);
    }

    @Test
    public void testDivisionNegativeZahlen() {
        System.out.println("Division von negativen Zahlen");
        double a = -4.0;
        double b = -2.0;
        Division instance = new Division();
        double result = instance.berechne(a, b);
        assertEquals(2.0, result, 0.0);
    }

    @Test
    public void testDivisionOutOfScope() {
        System.out.println("Division von Werten außerhalb des rechenbaren Bereich");
        double a = 1.21548554878888888879E308;
        double b = 0.4;
        Division instance = new Division();
        double result = instance.berechne(a, b);
        assertEquals(1d / 0d, result, 0.0);
    }
}
