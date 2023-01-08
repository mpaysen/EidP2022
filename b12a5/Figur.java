/*
 * @author mpayse2s
 */
public abstract class Figur {
  private static int anzahl;
  private Punkt2D mitte;

  public Figur() {
    ++anzahl;
  }

  public static int anzahl() {
    return anzahl;
  }

  public Figur(Figur f) {
    this();
  }

  public abstract double umfang();

  public abstract double flaeche();

  public abstract double durchmesser();

  public void setMitte(Punkt2D mitte) {
    this.mitte = mitte;
  }

  public Punkt2D mitte() {
    return new Punkt2D(mitte);
  }

  public abstract boolean istEnthalten(Punkt2D p);

  public abstract boolean equals(Object o);

  public abstract double radius();

  public abstract double hoehe();

  public abstract double breite();

  public Figur verschiebe(double dx, double dy) {
    mitte.verschiebe(dx, dy);
    return this;
  }

  public String toString() {
    return "(" + mitte.x() + "," + mitte.y() + ")";
  }

}
