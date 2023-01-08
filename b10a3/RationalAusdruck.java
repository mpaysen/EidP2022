/**
 * @author mpayse2s
 */
import java.util.Scanner;
public class RationalAusdruck {

  public static Rational auswertung(Rational a, char op, Rational b) throws IllegalArgumentException {
    switch (op) {
      case('+'):
        return a.add(b);
      case ('-'):
        return a.sub(b);
      case ('/'):
        return a.div(b);
      case ('*'):
        return a.mul(b);
      default:
        throw new IllegalArgumentException("op is false");
    }
  }

  public static Rational next(Scanner sc) throws java.util.InputMismatchException, ArithmeticException {
    try {
      Rational r1 = Rational.parse(sc.next());
      String opt = sc.next();
      Rational r2 = Rational.parse(sc.next());
      if (opt.length() > 1) {
        throw new java.util.InputMismatchException();
      }
      char op = opt.charAt(0);
      return auswertung(r1, op, r2);
    } catch (ArithmeticException e) {
      throw e;
    } catch (Exception e) {
      throw new java.util.InputMismatchException();
    }
  }

  public static void dialog() throws java.io.IOException {
    try {
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
        Rational r = next(sc);
        System.out.println("= " + r.toString());
      }
      sc.close();
    } catch (Exception e) {
      throw new java.io.IOException();
    }
    }
}
