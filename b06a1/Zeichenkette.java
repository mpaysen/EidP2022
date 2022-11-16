/**
 * @author mpayse2s
 */

public class Zeichenkette {

  public static int anzahlBuchstaben(String str) {
    if (str.length() == 0) {
      return 0;
    }
    int counter = 0;
    int i = 0;
    while (i < str.length()) {
      char c = str.charAt(i);
      if (Character.isLetter(c)) {
        ++counter;
      }
      ++i;
    }
    return counter;
  }

  public static boolean istZiffernfolge(String str) {
    if (str.length() == 0) {
      return true;
    }
    int i = 0;
    while (i < str.length()) {
      char c = str.charAt(i);
      if (!(48 <= c & c <= 57)) {
        return false;
      }
      ++i;
    }
    return true;
  }

  public static boolean istName(String str) {
    if (str.length() == 0) {
      return true;
    }
    boolean letter = true;
    int i = 0;
    while (i < str.length()) {
      char c = str.charAt(i);
      if (!Character.isLetter(c) & c != '-') {
        letter = false;
      }
      ++i;
    }
    return (
      !str.contains(" ") &
      !str.substring(0, 1).contains("-") &
      !str.substring(str.length()-1).contains("-") & letter
    );
  }

  public static String vokaleGross(String str) {
    String strr= "";
    int i = 0;
    while (i < str.length()) {
      char c = str.charAt(i);
      if ((c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u') ||
        (c == 'A' | c == 'E' | c == 'I' | c == 'O' | c == 'U')) {
        strr += Character.toUpperCase(c);
      }
      else {
        strr += Character.toLowerCase(c);
      }
      ++i;
    }
    return strr;
  }
}
