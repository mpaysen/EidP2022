public final class Porsche extends Sportwagen {
  private final static int vmax = 66;
  private static int anzahl;

  public Porsche() {
    super();
    ++anzahl;
  }

  public final int vmax() { //Überschreiben der Instanzmethode
    return super.vmax() + 20;
  }


  public final int vmax(int alter) { //Überladen der Instanzmethode vmax
    return vmax - alter;
  }

  public static final int anzahl() { //Überschatten der Klassenmethode
    return anzahl;
  }


}