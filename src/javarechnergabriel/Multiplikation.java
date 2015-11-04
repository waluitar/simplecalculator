package javarechnergabriel;

/**
 * Klasse Multiplikation beinhaltet die Methode berechne, die das Produkt
 * zurückgibt
 *
 * @author Gabriel Kunzer
 */
public class Multiplikation implements Rechenverhalten {

    public Multiplikation() {

    }

    @Override
    public double berechne(double a, double b) {
        return a * b;
    }
}
