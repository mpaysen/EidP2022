/*
 *  @author mpayse2s
 */
import java.io.PrintStream;
import java.util.Scanner;

public class Eingabe {
  public static int filter(Scanner sc, PrintStream ps, String start, String stop, String skip) {
    String str = "";
    String i = "";
    int counter = 0;
    while (sc.hasNext()) {
      i = sc.next();
      if (i.equals(start)) {
        while (!i.equals(stop)) {
          i = sc.next();
        }
        i = "";
      }
      if ((i.equals(skip))) {
        sc.nextLine();
        i = "";
      }
      if (i != "") {
        str += i;
        str += " ";
        counter++;
      }
    }
    ps.println(str);
    return counter;
  }
}
