/**
 * @author mpayse2s
 */
public class Mathe {

  public static int addRek(int a, int b) {
    if (b < 0)
      return subRek(a, -b);
    return b == 0 ? a : addRek(a + 1, b - 1);
  }

  public static int subRek(int a, int b) {
    if (b < 0)
      return addRek(a, -b);
    return b == 0 ? a : subRek(a - 1, b - 1);
  }

  public static int mulRek(int a, int b) {
    return vorzeichenMul(a, b) * mulRekPos(Math.abs(a), Math.abs(b));
  }

  public static int mulRekPos(int a, int b) {
    return a == 0 ? 0 : b + mulRekPos(a - 1, b);
  }

  public static int divRek(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException();
    }
    return vorzeichenMul(a, b) * divRekPos(Math.abs(a), Math.abs(b), 0);
  }

  private static int divRekPos(int a, int b, int i) {
    return a < 0 ? i - 1 : divRekPos(a - b, b, i + 1);
  }

  public static int modRek(int a, int b) {
    if (a == 0) {
      return 0;
    }
    return (b > 0) ? modRekPos(Math.abs(a), Math.abs(b)) : -modRekPos(Math.abs(a), Math.abs(b));
  }

  public static int modRekPos(int a, int b) {
    return a < 0 ? a + b : modRekPos(a - b, b);
  }

  public static int modRekNeg(int a, int b) {
    return a > 0 ? a + b : modRekPos(a + b, b);
  }

  public static int powRek(int a, int b) {
    return b == 0 ? 1 : a * powRek(a, b - 1);
  }

  private static int vorzeichenMul(int x, int y) {
    return (x < 0) == (y < 0) ? 1 : -1;
  }
}
