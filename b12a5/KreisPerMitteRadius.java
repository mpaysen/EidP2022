/*
 * @author mpayse2s
 */
public class KreisPerMitteRadius extends FigurPerMitte {
  private double radius;

  public KreisPerMitteRadius(Punkt2D p, double radius) {
    super(p);
    if (radius < 0) {
      throw new IllegalArgumentException();
    }
    this.radius = radius;
  }

  public KreisPerMitteRadius(KreisPerMitteRadius p) {
    this(p.mitte(), p.radius());
  }

  public double hoehe() {
    return radius;
  }

  public double breite() {
    return radius;
  }

  public double flaeche() {
    return radius * radius * Math.PI;
  }

  public double durchmesser() {
    return radius * 2;
  }

  public double umfang() {
    return radius * Math.PI * 2;
  }

  public double radius() {
    return radius;
  }

  public boolean istEnthalten(Punkt2D p) {
    if (p.abstand(super.mitte()) <= radius) {
      return true;
    }
    return false;
  }

  public boolean equals(Object o) {
    if (!(o instanceof KreisPerMitteRadius)) {
      return false;
    }
    KreisPerMitteRadius p = (KreisPerMitteRadius) o;
    if (super.mitte().equals(p.mitte()) & Mathe.equals(radius, p.radius())) {
      return true;
    }
    return false;
  }

  public String toString() {
    double x = this.mitte().x();
    double y = this.mitte().y();
    double r = radius;
    return "[" + new Punkt2D(x, y).toString() + "," + r + "]";
  }
}
