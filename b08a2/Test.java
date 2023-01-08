public class Test {
  public static void main(String[] args) {
    Rational r1 = new Rational(48, 18);
    Rational r2 = new Rational(r1);;
    System.out.println(r1.zaehler());
    System.out.println(r1.nenner());

    System.out.println(r2.zaehler());
    System.out.println(r2.nenner());

  }
}