/**
 * @author mpayse2s
 */
public class Zeichenkette {
  public static String verkuerze(String s, int n) {
    String str = "";
    int i = 0;
    int b = s.length() - n;
    if (s.length() - (2 * n) > 5) {
      while (i < n) {
        char c = s.charAt(i);
        str += c;
        ++i;
      }
      str += "[...]";
      while (b < s.length()) {
        char c = s.charAt(b);
        str += c;
        ++b;
      }
      return str;
    }
    return s;
  }
}
