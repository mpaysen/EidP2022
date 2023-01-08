/*
 *  @author mpayse2s
 */
public class Stromvertrag {
  static int anzahl = 0;
  private int nummer;
  private String name;
  private int monat;
  private int zaehler;
  int fix = 1000;
  int var = 30;

  public Stromvertrag(String name, int monat, int zaehler) {
    if (monat < 0 | zaehler < 0) {
      throw new IllegalArgumentException();
    }
    this.name = name;
    this.monat = monat;
    this.zaehler = zaehler;
    ++anzahl;
    this.nummer = anzahl;

  }

  protected void setKosten(int fix, int var) {
    this.fix = fix;
    this.var = var;
  }

  public static int anzahl() {
    return anzahl;
  }

  public int nummer() {
    return this.nummer;
  }

  public int monat() {
    return this.monat;
  }

  public int zaehler() {
    return this.zaehler;
  }

  public int kostenFix(int monat) {
    if (monat < 0) {
      throw new IllegalArgumentException();
    }
    return monat * fix;
  }

  public int kostenVariabel(int monat, int zaehler) {
    if (monat < 0 | zaehler < 0) {
      throw new IllegalArgumentException();
    }
    return zaehler * var;
  }

  public int rechnung(int monat, int zaehler) {
    if (monat < this.monat | zaehler < this.zaehler) {
      throw new IllegalArgumentException();
    }
    int fmonat = monat - this.monat;
    int fzaehler = zaehler - this.zaehler;
    int kosten = kostenFix(fmonat) + kostenVariabel(fmonat, fzaehler);
    this.monat = monat;
    this.zaehler = zaehler;
    return kosten;
  }

}
