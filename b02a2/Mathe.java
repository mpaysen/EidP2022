/*
 * @author mpayse2s
 * Programm: with two methods, abs and max3
 * Method abs: returns abs Value of <n>
 * Method max3: returns the max number of three Integer <a, b, c>
 */
public class Mathe {
  public static int abs(int n) {
    if (n < 0) {
      return -n;
    }
    return n;
  }

  public static int max3(int a, int b, int c) {
    if (a >= b && a >= c) {
      return a;
    } else if (b >= a && b >= c) {
      return b;
    } else {
      return c;
    }
  }
}
