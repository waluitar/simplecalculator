package javarechnergabriel;

/**
 * Klasse Addition beinhaltet die Methode berechne, die die 2 Werte addiert
 * zurückgibt
 *
 * @author Gabriel Kunzer
 */
public class Addition implements Rechenverhalten {

    public Addition() {

    }

    @Override
    public double berechne(double a, double b) {
        return a + b;
    }
}
