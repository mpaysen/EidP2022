/*
 * @author mpayse2s
 */
public class Mann extends Mensch {
  static int anzahl;

  public static int anzahl() {
    return anzahl;
  }

  public Mann(String name, int alter, int groesse, int gewicht) {
    super.setName(name);
    super.setAlter(alter);
    super.setGroesse(groesse);
    super.setGewicht(gewicht);
    super.setAnzahl();
    super.setChromosomen("XY");
    ++anzahl;
  }

  public int gewicht() {
    return super.gewicht() + 5;
  }

  public String toString() {
    String str = super.name() + " " + chromosomen() + " " + super.alter() + " ";
    return str + istVolljaehrig() + " " + groesse() + " " + gewicht() + " " + preisHaarschnitt();
  }
}
