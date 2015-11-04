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
public class SubtraktionTest {

    public SubtraktionTest() {
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
     * Test of berechne method, of class Subtraktion.
     */
    public void testSubtrahierenEinfach() {
        System.out.println("einfaches Subtrahieren");
        double a = 6.0;
        double b = 4.0;
        Subtraktion instance = new Subtraktion();
        double result = instance.berechne(a, b);
        assertEquals(2.0, result, 0.0);
    }

    @Test
    public void testSubtrahierenGroßeZahlen() {
        System.out.println("subtrahieren von großen Zahlen");
        double a = 7777777777777777.7777777777777777;
        double b = 4444444444444444.4444444444444444;
        Subtraktion instance = new Subtraktion();
        double result = instance.berechne(a, b);
        assertEquals(3333333333333333.33333333333333, result, 0.0);
    }

    @Test
    public void testSubtrahierenOutofScope() {
        System.out.println("Subtrahieren außerhalb des Bereichs");
        double a = 1.542248556548654654E305;
        double b = 1.0;
        Subtraktion instance = new Subtraktion();
        double result = instance.berechne(a, b);
        assertEquals(1.542248556548654654E305, result, 0.0);

    }

    @Test
    public void testSubtrahierenNegativeZahlen() {
        System.out.println("subtrahieren von negativen Zahlen");
        double a = -2;
        double b = -6;
        Subtraktion instance = new Subtraktion();
        double result = instance.berechne(a, b);
        assertEquals(4.0, result, 0.0);
    }
}
