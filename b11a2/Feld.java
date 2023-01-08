/*
 * @author mpayse2s
 */
public class Feld {
  public static int[] umkehren(int[] f) {
    int[] r = new int[f.length];
    for (int i = 0; i < f.length; ++i) {
      r[i] = f[(f.length - 1) - i];
    }
    return r;
  }

  public static void umkehrenInPlace(int[] f) {
    int[] tmp = new int[f.length];
    for (int i = 0; i < f.length; ++i) {
      tmp[i] = f[(f.length - 1) - i];
    }
    for (int i = 0; i < f.length; ++i) {
      f[i] = tmp[i];
    }
  }
}
