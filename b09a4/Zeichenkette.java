/**
 * @author mpayse2s
 */
public class Zeichenkette {
  public static boolean istPalindromLoop(String x) {
    if (x.equals(""))
      return true;
    x = x.toLowerCase();
    String y = "";
    for (int i = x.length() - 1; i >= 0; i--) {
      y += x.charAt(i);
    }
    return y.equals(x);
  }

  public static boolean istPalindromRek(String x) {
    x = x.toLowerCase();
    if (x.length() <= 1)
      return true;
    return x.charAt(0) == x.charAt(x.length() - 1) && istPalindromRek(nextTry(x));
  }

  private static String nextTry(String x) {
    String y = "";
    for (int i = 1; i < x.length() - 1; i++) {
      y += x.charAt(i);
    }
    return y;
  }
}

