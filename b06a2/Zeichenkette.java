/**
 * @author mpayse2s
 */

public class Zeichenkette {

  public static String rueckwaerts(String str) {
    String strr = "";
    int i = str.length() - 1;
    while (i >= 0) {
      char c = str.charAt(i);
      strr += c;
      --i;
    }
    return (strr);
  }

  public static String einfuegung(String s, int p, String t) {
    String str = "";
    int i = 0;
    if (p == s.length()) {
      str += s;
      str += t;
      return str;
    }
    while (i < s.length()) {
      char c = s.charAt(i);
      if (i == p) {
        str += t;
        str += c;
      } else {
        str += c;
      }
      ++i;
    }

    return str;
  }
}
