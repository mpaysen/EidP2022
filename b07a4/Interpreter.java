/*
 * @author mpayse2s
 */

import java.util.Scanner;
import java.io.PrintStream;

public class Interpreter {
  public static void verarbeiteEingabe(Scanner sc, PrintStream ps) {
    while (sc.hasNext()) {
      verarbeiteEingabeEinzel(sc, ps);
    }
  }

  public static void verarbeiteEingabeEinzelVor(Scanner sc, PrintStream ps, char c, String str) {
    if (str.lastIndexOf(c) != -1) {
      ps.println(str.substring(0, str.lastIndexOf(c)));
    } else {
      ps.println("");
    }
  }

  public static void verarbeiteEingabeEinzelNach(Scanner sc, PrintStream ps, char c, String str) {
    if (str.indexOf(c) != -1) {
      ps.println(str.substring(str.indexOf(c) + 1, str.length()));
    } else {
      ps.println(str);
    }
  }

  public static void verarbeiteEingabeEinzel(Scanner sc, PrintStream ps) {
    String position = sc.next();
    String c = sc.next();
    char ci = c.charAt(0);
    sc.next();
    String str = sc.next();
    if (position.equals("vor")) {
      verarbeiteEingabeEinzelVor(sc, ps, ci, str);
    } else {
      verarbeiteEingabeEinzelNach(sc, ps, ci, str);
    }
  }
}
