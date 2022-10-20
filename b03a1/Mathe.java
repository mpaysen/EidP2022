/*
 * @author mpayse2s
 * Classe Mathe mit den Methoden ggTAdd, ggtMul und ggTAddOut
 */
public class Mathe {


  public static int ggTAdd(int a, int b) {
    if (a == 0) {    // wenn a gleich 0 gebe b zurück
      return b;
    }
    while (b != 0) { // fuehre die folgendes aus bis b gleich 0 ist:
      if (b > 0) {   // wenn b größer als 0 ist fuehre folgendes aus:
        if (a > b) { // wenn a größer als b ist fuehre folgendes aus:
          a -= b;    // ziehe den Wert b von a ab und spreichere dies in der Variable a
        } else if (b >= a) { // ansonsten prüfe ob b gleich oder größer als a ist.
          b -= a; // ziehe den Wert a von b ab und spreichere dies in der Variable b
        }
      }
    }
    return a; // gebe den a zurück
  }


  public static int ggTAddOut(int a, int b) {
    if (a == 0) {    // wenn a gleich 0 gebe b zurück
      System.out.printf("%s %s%n", a, b);
      return b;
    }
    int i = 0;
    while (b != 0) { // fuehre die folgendes aus bis b gleich 0 ist:
      ++i;
      if (b > 0) {   // wenn b größer als 0 ist fuehre folgendes aus:
        System.out.printf("%s %s%n", a, b);
        if (a > b) { // wenn a größer als b ist fuehre folgendes aus:
          a -= b;    // ziehe den Wert b von a ab und spreichere dies in der Variable a
        } else if (b >= a) { // ansonsten prüfe ob b gleich oder größer als a ist.
          b -= a; // ziehe den Wert a von b ab und spreichere dies in der Variable b
        }
      }
    }
    System.out.printf("%s %s%n", a, b);
    return i; // gebe den a zurück
  }


  public static int ggTMul(int a, int b) {
    while (b != 0) {
      if (b > 0) {
        int t = a % b;
        a = b;
        b = t;
      }
    }
    return a;
  }


  public static int ggTMulOut(int a, int b) {
    int i = 0;
    while (b != 0) {
      ++i;
      if (b > 0) {
        System.out.printf("%s %s%n", a, b);
        int t = a % b;
        a = b;
        b = t;
      }
    }
    System.out.printf("%s %s%n", a, b);
    return i;
  }


  public static int ggT(int a, int b) {
    return ggTMul(Math.abs(a), Math.abs(b));
  }
}


