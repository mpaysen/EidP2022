public final class Autobahn extends Strasse {
  private static int zaehler = 0;
  private final static int vmaxmax = 100;
  private final int vmax;
  
  public Autobahn(int laenge) {
    this(laenge,vmaxmax);
  }

  public Autobahn(int laenge, int vmax) {
    super(laenge);
    this.vmax = vmax;
    ++zaehler;
  }

  public static int nummer () {
    return zaehler;
  }

  public final int vmax() {
    return vmax;
  }
}