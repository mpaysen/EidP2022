/*
 *  @author mpayse2s
 *  Class Eingabe with the method zaehlen
 */
import java.util.Scanner;
public class Eingabe {
  public static int zaehlen(Scanner sc, String s) {
    // initialize the counter variable a
    int a = 0;
    // While loop if another string (except white space) follows.
    while (sc.hasNext()) {
      // read next string in n
      String n = sc.next();
      // If n corresponds to the string s increase a by one.
      if (n.equals(s)) {
        ++a;
      }
    }
    // return a after ending the loop
    return a;
  }
}
