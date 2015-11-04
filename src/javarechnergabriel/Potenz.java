package javarechnergabriel;

/**
 * Klasse Potenz beinhaltet die Methode berechne, die das Produkt der Potenz
 * zurückgibt
 *
 * @author Gabriel Kunzer
 */
public class Potenz implements Rechenverhalten {

    public Potenz() {

    }

    @Override
    public double berechne(double a, double b) {
        return Math.pow(a, b);

    }
}
