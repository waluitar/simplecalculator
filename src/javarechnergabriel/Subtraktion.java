package javarechnergabriel;

/**
 * Klasse Subtraktion beinhaltet die Methode berechne, die Wert a von Wert b
 * subtrahiert zurückgibt
 *
 * @author Gabriel Kunzer
 */
public class Subtraktion implements Rechenverhalten {

    public Subtraktion() {
    }

    @Override
    public double berechne(double a, double b) {

        return a - b;
    }
}
