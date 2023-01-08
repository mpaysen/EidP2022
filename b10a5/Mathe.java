/*
 * @author mpayse2s
 */
public class Mathe {

  public static double pi1(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    double k = 0.0;
    double sum = 0.0;
    double pi4 = 0.0;
    int z = -1;
    try {
      while (n >= k) {
        z *= -1;
        sum = (z / (2 * k + 1));
        pi4 += sum;
        ++k;
      }
      return pi4 * 4;
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }
  }

  public static double pi2(double eps) throws IllegalArgumentException {
    if (eps <= 0 || eps > 1) {
      throw new IllegalArgumentException();
    }
    int z = 1;
    double k = 0.0;
    double sum = 1 / (2 * 0 + 1);
    double pi4 = 0.0;
    try {
      while (!(Math.abs(sum) < eps)) {
        pi4 += sum;
        z *= -1;
        ++k;
        sum = (z / (2 * k + 1));
      }
      return pi4 * 4;
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }
  }

  public static double pi2() throws IllegalArgumentException {
    return pi2(0.00000001);
  }

  public static double pi3(double eps) throws IllegalArgumentException {
    if (eps <= 0) {
      throw new IllegalArgumentException();
    }
    int z = 1;
    double k = 0.0;
    double sum = 1 / (2 * 0 + 1);
    double pi4 = 0.0;
    try {
      while (!(Math.abs(Math.PI - pi4 * 4) < eps)) {
        pi4 += sum;
        z *= -1;
        ++k;
        sum = (z / (2 * k + 1));
      }
      return pi4 * 4;
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }
  }

  public static double pi3() throws IllegalArgumentException {
    return pi3(0.00000001);
  }
}
