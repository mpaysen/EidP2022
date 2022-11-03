/*
 *  @author mpayse2s
 *  Class Messdaten with the method durchschnitt
 */
import java.util.Scanner;
public class Messdaten {
  public static double durchschnitt(Scanner sc, String g) {
    int counter = 0;
    String datum = "";

    String type = "";

    double max = -Double.MAX_VALUE;
    double average = 0.0;

    while (sc.hasNext()) {
      String d = sc.nextInt() + "/" + sc.nextInt() + "/" + sc.nextInt();
      String t = sc.next();
      double m = sc.nextDouble();
      if (t.equals(g)) {
        if (max < m) {
          max = m;
          datum = d;
          type = t;
        }
        ++counter;
        average += m;
      }
    }
    System.out.println("max. " + type + " (" + max + ") am " + datum);
    average /= counter;
    return average;
  }
}
