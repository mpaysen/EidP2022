/**
 * @author mpayse2s
 */
public class GeometrieTest {
  public static boolean test() {
    return umfTest() && flaeTest();
  }

  public static boolean flaeTest() {
    return 
    checkflaecheREck(13, 45, 585)
    & checkflaecheREck(1, 0, 0)
    & checkflaecheREck(0, 1, 0)
    & checkflaecheREck(0, 0, 0)
    & checkflaecheREck(3.4, 4.7, 15.98)
    & checkflaecheREck(0.0, 4.7, 0.0);
  }


  public static boolean umfTest() {
    return 
    checkumfangREck(13, 45, 116)
    & checkumfangREck(0, 1, 2)
    & checkumfangREck(1, 0, 2)
    & checkumfangREck(0, 0, 0)
    & checkumfangREck(3.4, 4.7, 16.2)
    & checkumfangREck(0.0, 4.7, 9.4);
  }

  public static boolean checkflaecheREck(double a, double b, double erw) {
    double erg = Geometrie.flaecheREck(a, b);
    boolean isTrue = (equals(erg, erw));
    if (!isTrue) {
      System.out.println("FEHLER: max(" + a + "," + b + ")==" + erg + " statt " + erw);
    }
    return isTrue;
  }

  public static boolean checkumfangREck(double a, double b, double erw) {
    double erg = Geometrie.umfangREck(a, b);
    boolean isTrue = (equals(erg, erw));
    if (!isTrue) {
      System.out.println("FEHLER: max(" + a + "," + b + ")==" + erg + " statt " + erw);
    }
    return isTrue;
  }

  public static boolean equals(double x, double y) {
    double eps = 0.000001;
    return (x == y || (Math.abs(x - y) / Math.max(Math.abs(x), Math.abs(y))) < eps);
  }
}

