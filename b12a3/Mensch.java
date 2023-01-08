/*
 * @author mpayse2s
 */
public class Mensch {
  static int anzahl;
  private String name;
  private String chromosomen;
  private int alter;
  private int groesse;
  private int gewicht;

  public static int anzahl() {
    return anzahl;
  }

  public void setAnzahl() {
    ++anzahl;
  }

  public void setName(String str) {
    name = str;
  }

  public String name() {
    return name;
  }

  public void setChromosomen(String str) {
    chromosomen = str;
  }

  public String chromosomen() {
    return chromosomen;
  }

  public void setAlter(int i) {
    alter = i;
  }

  public int alter() {
    return alter;
  }

  public void setGroesse(int i) {
    groesse = i;
  }

  public int groesse() {
    return groesse;
  }

  public void setGewicht(int i) {
    gewicht = i;
  }

  public int gewicht() {
    return gewicht;
  }

  public int preisHaarschnitt() {
    if (chromosomen.equals("XY")) {
      return 10 + (int) Math.round(0.25 * alter);
    } else {
      return 20 + (int) Math.round(0.6666 * alter);
    }
  }

  public static int volljaehrigkeitsAlter() {
    return 18;
  }

  public boolean istVolljaehrig() {
    if (alter >= volljaehrigkeitsAlter()) {
      return true;
    }
    return false;
  }

  public String toString() {
    String str = name + " " + chromosomen + " " + alter + " " + istVolljaehrig();
    return str + " " + groesse + " " + gewicht + " " + preisHaarschnitt();
  }
}
