/*
 * @author mpayse2s
 */
public class Feld {

  public static boolean istHomogen(int[] f) {
    try {
      for (int i = 0; i < (f.length - 1); ++i) {
        if (f[i] != f[i + 1]) {
          return false;
        }
      }
      return true;
    } catch (NullPointerException e) {
      throw new NullPointerException();
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }
  }

  public static boolean istSortiert(int[] f) {
    try {
      for (int i = 0; i < (f.length - 1); ++i) {
        if (f[i] > f[i + 1]) {
          return false;
        }
      }
      return true;
    } catch (NullPointerException e) {
      throw new NullPointerException();
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }
  }

  public static int maxPos(int[] f) {
    if (f.length < 1) {
      throw new IllegalArgumentException();
    }
    try {
      int p = 0;
      for (int i = 0; i < f.length; ++i) {
        if (f[p] < f[i]) {
          p = i;
        }
      }
      return p;
    } catch (NullPointerException e) {
      throw new NullPointerException();
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }
  }

  public static int maxElement(int[] f) {
    if (f.length < 1) {
      throw new IllegalArgumentException();
    }
    try {
      return f[maxPos(f)];
    } catch (NullPointerException e) {
      throw new NullPointerException();
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }
  }

  public static int[] max(int[] f1, int[] f2) {
    if (f1.length != f2.length) {
      throw new IllegalArgumentException();
    }
    try {
      int[] r = new int[f1.length];
      for (int i = 0; i < f1.length; ++i) {
        if (f1[i] < f2[i]) {
          r[i] = f2[i];
        } else {
          r[i] = f1[i];
        }
      }
      return r;
    } catch (NullPointerException e) {
      throw new NullPointerException();
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }
  }
}
