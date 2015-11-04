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
public class AdditionTest {

    public AdditionTest() {
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
     * Test of berechne method, of class Addition.
     */
    @Test
    public void testAddierenEinfach() {
        System.out.println("EinfachesAddieren");
        double a = 4.0;
        double b = 4.0;
        Addition instance = new Addition();
        double result = instance.berechne(a, b);
        assertEquals(8.0, result, 0.0);
    }

    @Test
    public void testAddiereGroßeZahlen() {
        System.out.println("berechneGroßeZahlen");
        double a = 2424242424242424.2424242424242424;
        double b = 5353535353535353.5353535353535353;
        Addition instance = new Addition();
        double result = instance.berechne(a, b);
        assertEquals(7777777777777777.7777777777777777, result, 0.0);
    }

    @Test
    public void testAddiereOutofScope() {
        System.out.println("berechneOutofScope");
        double a = 1.542248556548654654E305;
        double b = 1.0;
        Addition instance = new Addition();
        double result = instance.berechne(a, b);
        assertEquals(1.542248556548654654E305, result, 0.0);
    }

    @Test
    public void testAddiereNegativeZahlen() {
        System.out.println("berechneNegativeZahlen");
        double a = -2;
        double b = -6;
        Addition instance = new Addition();
        double result = instance.berechne(a, b);
        assertEquals(-8.0, result, 0.0);
    }
}
