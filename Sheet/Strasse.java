public abstract class Strasse { 
  private final int laenge;

  public Strasse(int laenge) {
    this.laenge = laenge;
  }

  public final int laenge() {
    return laenge;
  }

  public abstract int vmax();

  public final int dauer(Fahrzeug f) {
    return laenge() / Math.min(f.vmax(), vmax());
  }
}