public class Sportwagen implements Fahrzeug {
  private final static int vmax = 66;
  private static int anzahl;

  public Sportwagen() {
    ++anzahl;
  }

  public int vmax() {
    return vmax;
  }

  public static int anzahl() {
    return anzahl;
  }
  
}
