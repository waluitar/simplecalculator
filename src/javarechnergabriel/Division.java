package javarechnergabriel;

/**
 * Klasse Division beinhaltet die Methode berechne, die den Quotienten
 * zurückgibt
 *
 * @author Gabriel Kunzer
 */
public class Division implements Rechenverhalten {

    public Division() {

    }

    @Override
    public double berechne(double a, double b) {
        if (b == 0) {
            System.out.println("Divison durch 0 nicht möglich");
            return -1;
        } else {
            return a / b;
        }
    }
}
