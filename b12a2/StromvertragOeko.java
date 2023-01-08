/*
 *  @author mpayse2s
 */
public class StromvertragOeko extends Stromvertrag {
  int fix = 1200;
  int var = 35;
  static int anzahl = 0;

  public StromvertragOeko(String name, int monat, int zaehler) {
    super(name, monat, zaehler);
    super.setKosten(fix, var);
    ++anzahl;
  }

  public static int anzahl() {
    return anzahl;
  }

  public int kostenFix(int monat) {
    return super.kostenFix(monat);
  }

  public int kostenVariabel(int monat, int zaehler) {
    return super.kostenVariabel(monat, zaehler);
  }

  public int rechnung(int monat, int zaehler) {
    return super.rechnung(monat, zaehler);
  }
}
