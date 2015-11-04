package javarechnergabriel;

/**
 * Klasse Rechner
 *
 * @author Gabriel Kunzer
 */

public class Rechner {

    private Rechenverhalten rechenart;
    private double anzeigewert;

    public Rechner() {

    }

    public void berechne(double a, double b) {
        anzeigewert = rechenart.berechne(a, b);
    }

    public double gibAnzeigewert() {
        return anzeigewert;
    }

    public void setzeRechenverhalten(Rechenverhalten rechenart) {
        this.rechenart = rechenart;
    }

}
