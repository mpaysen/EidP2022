import java.util.*;
public class RationalTest {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int zaehler1 = sc.nextInt();
      Rational bruch1 = new Rational(zaehler1);
      if (sc.hasNextInt()) {
          int nenner1 = sc.nextInt();
          bruch1 = new Rational(zaehler1, nenner1);
      }

      while (true) {
          String operator = sc.next();
          if (operator.equals(".")) {
              break;
          }
          int zaehler2 = sc.nextInt();
          Rational bruch2 = new Rational(zaehler2);
          if (sc.hasNextInt()) {
              int nenner2 = sc.nextInt();
              bruch2 = new Rational(zaehler2, nenner2);
          }
          if (operator.equals("+")) {
              bruch1 = bruch1.add(bruch2);
          }
          if (operator.equals("-")) {
              bruch1 = bruch1.sub(bruch2);
          }
          if (operator.equals("*")) {
              bruch1 = bruch1.mul(bruch2);
          }
          if (operator.equals("/")) {
              bruch1 = bruch1.div(bruch2);
          }
      }
      System.out.println(bruch1.toString());
      sc.close();
  }
}