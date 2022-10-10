/*
 * @author mpayse2s
 * Programm: with two methods, abs and max3
 * Method abs: returns abs Value of <n>
 * Method max3: returns the max number of three Integer <a, b, c>
 */
public class Mathe {
  public static int fak(int n) {
    return fakRek(n);
  }

  public static int fakLoop(int n) {
    if (n == 0) {
      return 1;
    }

    int a = 1;
    int i = 0;
    while (i < n) {
      i++;
      a = a * i;
    }
    return a;
  }

  public static int fakRek(int n) {
    if (n == 0) {
      return 1;
    } else {
      return fakRek(n - 1) * n;
    }
  }

  public static void quadrateAusgabeRueck(int n) {
    int i = 0;
    int a = n;
    while (i < n) {
      i++;
      System.out.println(a * a);
      a--;
    }
  }
}
