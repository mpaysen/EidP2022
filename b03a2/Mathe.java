/*
 * @author mpayse2s
 * Class math with the methods vielfache, einmaleins und nureinmaleins
 */
public class Mathe {
  public static String vielfache(int a, int n) {
    int i = 1;
    String str = "";
    // As long as i is not (n + 1) execute the while loop:
    while (i != (n + 1)) {
      // Multiply a by n and append the result to str, followed by a whitespace.
      str += (a * i) + " ";
      // pre add the numerator i by one.
      ++i;
    }
    // Return the str with the newline character appended.
    str += "\n";
    return (str);
  }

  public static String einmaleins(int n) {
    int i = 1;
    String str = "";
    // As long as i is not (n + 1) execute the while loop:
    while (i != (n + 1)) {
      // Call the method vielfache with the parameters i and n, and ppend the result to str.
      str += vielfache(i, n);
      // pre add the numerator i by one.
      ++i;
    }
    // Return the variable str.
    return str;
  }

  public static String nureinmaleins(int n) {
    int i = 1;
    int f = 1;
    String str = "";
    while (f != (n + 1)) {
      while (i != (n + 1)) {
        str += (f * i) + " ";
        ++i;
      }
      i = 1;
      str += "\n";
      ++f;
    }
    return str;
  }
}
