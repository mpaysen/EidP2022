public class pruefen {
  private double max = 200;
  private double min = 150;
  private double critical = 200;
  private double wert;

  void pruefen(double wert) throws CriticalValue {
    this.wert = wert;
    if (wert >= min && wert < critical) {
      return;
    } else if (wert >= critical && wert <= max) {
      throw new CriticalValue("Critical");
    } else {
      throw new IllegalValue();
    }
  }
  
}
