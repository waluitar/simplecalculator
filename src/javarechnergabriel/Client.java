package javarechnergabriel;

/**
 * Klasse Client beinhaltet die Methodee für den Wechsel der Strategy beinhaltet
 * die Methoden für die Eingabe und Auswahl der Rechenart
 *
 * @author Gabriel Kunzer
 */
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        // Wechsel der Strategie
        System.out.println("Testlauf des Taschenrechners");
        waehle();
    }

    public static void waehle() {
        System.out.println("Geben Sie die erste Ziffer ein mit denen Sie rechnen möchten");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Geben Sie den Operator ein: ");
        System.out.println("+ für Addition");
        System.out.println("- für Subtraktion");
        System.out.println("* für Multiplikation");
        System.out.println("/ für Division");
        System.out.println("pot für die Potenz");
        String sw = sc.next();
        System.out.println("Geben Sie die zweite Ziffer ein mit denen Sie rechnen möchten");
        double b = sc.nextDouble();

        Rechner rechner = new Rechner();
        switch (sw) {
            case "+":
                rechner.setzeRechenverhalten((new Addition()));
                rechner.berechne(a, b);
                System.out.println(rechner.gibAnzeigewert());
                break;

            case "-":
                rechner.setzeRechenverhalten((new Subtraktion()));
                rechner.berechne(a, b);
                System.out.println(rechner.gibAnzeigewert());
                break;

            case "*":
                rechner.setzeRechenverhalten((new Multiplikation()));
                rechner.berechne(a, b);
                System.out.println(rechner.gibAnzeigewert());
                break;

            case "/":
                rechner.setzeRechenverhalten((new Division()));
                rechner.berechne(a, b);
                System.out.println(rechner.gibAnzeigewert());
                break;

            case "pot":
                rechner.setzeRechenverhalten(new Potenz());
                rechner.berechne(a, b);
                System.out.println(rechner.gibAnzeigewert());
                break;
        }
    }
}