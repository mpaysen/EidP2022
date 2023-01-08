/*
 * @author mpayse2s
 */
public class Frau extends Mensch {
  static int anzahl;

  public static int anzahl() {
    return anzahl;
  }

  public Frau(String name, int alter, int groesse, int gewicht) {
    super.setName(name);
    super.setAlter(alter);
    super.setGroesse(groesse);
    super.setGewicht(gewicht);
    super.setAnzahl();
    super.setChromosomen("XX");
    ++anzahl;
  }

  public int groesse() {
    return super.groesse() - 5;
  }

  public String toString() {
    String str = super.name() + " " + chromosomen() + " " + super.alter() + " ";
    return str + istVolljaehrig() + " " + groesse() + " " + gewicht() + " " + preisHaarschnitt();
  }
}

