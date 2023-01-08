public class Test {
  public static void main(String[] args) {
    //Rational r1 = new Rational(48, 12);

    Rational r2 = Rational.parse("1-1");

    System.out.println(r2.zaehler());
    System.out.println(r2.nenner());

  }
}