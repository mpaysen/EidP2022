/*
 * @author mpayse2s
 */
public class RechteckXYPerMitteLaengen extends FigurPerMitte {
  private double breite, hoehe;

  public RechteckXYPerMitteLaengen(Punkt2D p, double breite, double hoehe) {
    super(p);
    this.breite = breite;
    this.hoehe = hoehe;
  }

  public RechteckXYPerMitteLaengen(RechteckXYPerMitteLaengen p) {
    this(p.mitte(), p.breite(), p.breite());
  }

  public double breite() {
    return this.breite;
  }

  public double hoehe() {
    return this.hoehe;
  }

  public double radius() {
    if (hoehe < breite) {
      return hoehe;
    }
    return breite;
  }

  public double durchmesser() {
    Punkt2D rop = new Punkt2D(super.mitte().x() + breite() / 2, super.mitte().y() + hoehe() / 2);
    Punkt2D lup = new Punkt2D(super.mitte().x() - breite() / 2, super.mitte().y() - hoehe() / 2);
    return lup.abstand(rop);
  }

  public double umfang() {
    return 2 * this.breite + 2 * this.hoehe;
  }

  public double flaeche() {
    return this.breite * this.hoehe;
  }


  public Punkt2D ecke(boolean istRechts, boolean istOben) {
    double x = this.mitte().x();
    double y = this.mitte().y();
    if (istRechts & istOben) {
      return new Punkt2D(x + breite() / 2, y + hoehe() / 2);
    } else if (!istRechts & istOben) {
      return new Punkt2D(x - breite() / 2, y + hoehe() / 2);
    } else if (istRechts & !istOben) {
      return new Punkt2D(x + breite() / 2, y - hoehe() / 2);
    } else {
      return new Punkt2D(x - breite() / 2, y - hoehe() / 2);
    }
  }

  public boolean equals(Object o) {
    if (!(o instanceof Figur)) {
      return false;
    }
    Figur p = (Figur) o;
    if (this.mitte().equals(p.mitte()) & Mathe.equals(this.hoehe(),
      p.hoehe()) & Mathe.equals(this.breite(), p.breite())) {
      return true;
    }
    return false;
  }

  public boolean istEnthalten(Punkt2D p) {
    boolean x = false;
    boolean y = false;
    if (p.x() <= super.mitte().x() + breite() / 2 & p.x() >= super.mitte().x() - breite() / 2) {
      x = true;
    }
    if (p.y() <= super.mitte().y() + hoehe() / 2 & p.y() >= super.mitte().y() - hoehe() / 2) {
      y = true;
    }
    if (x & y) {
      return true;
    }
    return false;
  }

  public String toString() {
    double x = this.mitte().x();
    double y = this.mitte().y();
    return "[" + new Punkt2D(x - breite() / 2, y - hoehe() / 2).toString() + ","
    + new Punkt2D(x + breite() / 2, y + hoehe() / 2).toString() + "]";
  }
}
