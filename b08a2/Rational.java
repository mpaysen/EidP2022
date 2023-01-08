/**
 * 
 * @author mpayse2s
 *
 */
public class Rational {

  private int zaehler;

  private int nenner;

  public Rational() {
    this.zaehler = 0;
    this.nenner = 1;
  }

  public Rational(int y) {
    this.zaehler = y;
    this.nenner = 1;
  }

  public Rational(int dividend, int divisor) {
    this.zaehler = (divisor < 0 ? -dividend : dividend) / Mathe.ggT(dividend, divisor);
    this.nenner = (divisor < 0 ? -divisor : divisor) / Mathe.ggT(dividend, divisor);
  }
  
  public Rational(Rational y) {
    this.zaehler = y.zaehler;
    this.nenner = y.nenner;
  }


  public int zaehler() {
    return this.zaehler;
  }

  public int nenner() {
    return this.nenner;
  }

  public boolean equals(Rational rationalReferenz) {
    return (zaehler() == rationalReferenz.zaehler
        && nenner() == rationalReferenz.nenner);
  }

  public boolean istKleiner(Rational rationalReferenz) {
    return ((zaehler() * rationalReferenz.nenner) < (rationalReferenz.zaehler * nenner()));
  }

  public Rational abs() {
    return new Rational(Math.abs(zaehler()), Math.abs(nenner()));
  }

  public Rational rez() {
    return new Rational(nenner(), zaehler());
  }

  public Rational add(Rational rationalReferenz) {
    return new Rational(zaehler() * rationalReferenz.nenner + rationalReferenz.zaehler * nenner(),
        nenner() * rationalReferenz.nenner);
  }

  public Rational sub(Rational rationalReferenz) {
    return new Rational(zaehler() * rationalReferenz.nenner - rationalReferenz.zaehler * nenner(),
        nenner() * rationalReferenz.nenner);
  }

  public Rational mul(Rational rationalReferenz) {
    return new Rational(zaehler() * rationalReferenz.zaehler, nenner() * rationalReferenz.nenner);
  }

  public Rational div(Rational rationalReferenz) {
    return new Rational(zaehler() * rationalReferenz.nenner, nenner() * rationalReferenz.zaehler);
  }

  @Override
  public String toString() {
    return String.format("%d/%d", zaehler(), nenner());
  }

}