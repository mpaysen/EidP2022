/*
 *  @author mpayse2s
 *  Class Eingabe with the method durchschnitt
 */
import java.util.Scanner;
public class Eingabe {
  public static double durchschnitt(Scanner sc) {
    // initialize the counter variable counter
    double counter = 0.0;
    // initialize the average variable a
    double a = 0.0;
    // while loop if another Double (except white space) follows.
    while (sc.hasNextDouble()) {
      // add next double to a
      a += sc.nextDouble();
      //increase counter by one.
      ++counter;
      // Divide a by the variable counter
      a = (sc.hasNextDouble()) ? a : a / counter;
    }
    // return a
    return a;
  }
}
