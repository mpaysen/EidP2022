public class DatumAusgabe {

  public static void main(String[] args) {
    Ausgabe(1400, 2140);
  
  }

  public static void Ausgabe(int a, int b) {
    while (a < b) {
    boolean c = (a < 1583) ? (a % 4 == 0) : (a % 400 == 0) | ((a % 4 == 0) & !(a % 100 == 0));
    System.out.printf("&& istSchaltjahrCheck(%s, %s )%n", a, c);
    ++a;
    }
  }

}