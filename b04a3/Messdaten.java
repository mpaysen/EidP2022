import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;

public class Messdaten {
  public static double durchschnitt(Scanner sc, String g) {
    String datum;
    String type;
    double d;

    while (sc.hasNextInt()) {
      datum += sc.nextInt();
    }
    while (sc.hasNext()) {
      type += sc.next();
    }
    while (sc.hasNextDouble()) {
      d += sc.nextDouble();
    }

    if (g.equals("Luftdruck")) {


    } else if (g.equals("Niederschlag")) {

    } else if (g.equals("Temperatur ")) {

    } else {
      System.out.print("Eingabe ungültig");
    }
    return a;
  }
}