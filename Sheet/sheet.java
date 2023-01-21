import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class sheet {

  public static boolean equals(double x, double y) {  // Gleitkommazahlen equals mit Rundungstoleranz
    double eps = 0.000001;
    return (x == y || (Math.abs(x-y) / Math.max(Math.abs(x), Math.abs(y))) < eps);
  }

  public static void bedingteOperatoren(int a ,int b) {
    if (0 < a & a < ++b) { // Wert von b wird stets erhöht
    } else if (0 < a && a < ++b) { // Wert von b ggf. unverändert
    }
  }

  public static double durchschnitt(Scanner sc, String g) {
    /* Eingabe:
    2018 10 16 Luftdruck 1014.7
    2018 10 17 Niederschlag 1.3
    2018 10 15 Temperatur 18.2
    2018 10 16 Niederschlag 0.0
    2018 10 17 Temperatur 16.8
     */

    int counter = 0;
    String datum = "";

    String type = "";

    double max = -Double.MAX_VALUE;
    double average = 0.0;

    while (sc.hasNext()) {
      String d = sc.nextInt() + "/" + sc.nextInt() + "/" + sc.nextInt(); // Das Datum wird als String  temporär eingelesen
      String t = sc.next(); // Der Typ wird temporär eingelesen
      double m = sc.nextDouble(); // Der Wert wird temporär eingelesen
      if (t.equals(g)) {  //String equals methode
        if (max < m) {
          max = m;
          datum = d;
          type = t;
        }
        ++counter;
        average += m;
      }
    }
    System.out.println("max. " + type + " (" + max + ") am " + datum);
    average /= counter;
    return average;
  }

  public static void main(String[] args) {
    //System.out.println(hallo(s1,s2));
    //Scanner sc = new Scanner(System.in);
    //System.out.println(durchschnitt(sc,"Temperatur"));
    //System.out.println(Rek(4));
    //System.out.println(fibRek(4));
  //einmaleins(1,5);
    double[][] d = {{0.6, 2.4, 5.6, 4} , {8, 5, 5, 9}, {12, 2, 3, 7}};
    printA(d);
    System.out.println();
    printA(spaltentausch(d, 0.6, 5.6));



  }

  public static void printA(double[][] d) {
    for (int i = 0; i < d.length; i++) {
      for (int n = 0; n < d[0].length; n++) {
        System.out.print(d[i][n] + " ");
      }
      System.out.println();
}
  }

  public static int pascal(int n, int k) {
    if(k == 0) {
      return 1;
    }
    if (k == n) {
      return 1;
    }
    if (k > n | n < 0 | k < 0) {
      throw new IllegalArgumentException();
    }
    return pascal(n -1 , k - 1 ) + pascal(n -1, k);
  }


  public static int Rek(int n) {
      int p = 0;
      int b = 1;
      int f = 1;

      while (p != n) { //F 346
        int a = b;
        int c = f;
         f = a + c;
         b = b + f;
        ++p;
      }
      return b;
    }

  private static int fibRek(int a, int b, int i, int n) {
    if (i > n) {
      return b;
    } else {
      return fibRek(b, a + b, i + 1, n);
    }
  }
  public static int fibRek(int n) {
    if (n < 2) {
      return n;
    } else {
      return fibRek(0, 1, 2, n);
    }
  }

  public static void einmaleins(int a, int b) {
    int f = a;
    int g = a;
    String str = "";
    while (a <= b) {
      while (f <= b ) {
      int s = a * f;
      str += s + " ";
      ++f;
    }
    f = g;
    System.out.println(str.substring(0,str.length()-1));
    ++a;
    str = "";
  }
    }
  
    public static String komplement(String str) {
      int a = 0;
      String strr = "";
      while(a < str.length()) {
        if(str.charAt(a) == 'C') {
          strr += "G";
        } else if(str.charAt(a) == 'G') {
          strr += "C";
        }
        if(str.charAt(a) == 'A') {
          strr += "T";
        } else if(str.charAt(a) == 'T') {
          strr += "A";
        }
        ++a;
      }
      return strr;
    }

    public static int[][] spiegle(int[][] r) {

      return r;
    }

    public static int f(int n) {
      if (n <= 1) {
        return 1;
      }
      return f(n-1) + 3 * n * (n - 1) + 1;
    }

    public static int ggt(int a, int b) {
      if (a == b) {
        return a;
      }
      if (a > b) {
        return ggt(a - b, b);
      } else {
        return ggt(a, b - a);
      }
    }

    public static double ef(double x) throws IllegalArgumentException {
      int k = 0;
      double ex = 0.0;
      double e = 0.0;
      int a = 0;
      while(true) {
        e += ex;
        if (k == 0) {
          ex = Math.pow(x, 1);
          ++k;
          continue;
        }
        if (!(ex > 0.000000000001)) {
          return 1 + e;
        }
        ++k;
        ++a;
        ex = pow(x, k) / (double)(k * a);
      }
    }
     public static double pow(double x, int e) {
        int i = 2;
        if (e == 0) {
          return 1;
        }
        while(i <= e) {
          x *= x;
          ++i;
        }
        return x;
      }

      public static double e(double x) { // 1P
        double r = 0; // Resultat // 1P
        double z = 1; // Zaehler // 1P
        int n = 1; // Nenner // 1P
        int k = 1; // 1P
        while (z/n > 1e-12) { // 3P
          r += z/n; // 2P
          z *= x; // 1P
          n *= k; // 1P
          ++k; // 1P
          } // Reihenfolge korrekt 2P
          return r; // 1P
        }


        //// Rekursion --- Schriftlich und Mathematisch...

        public static int pascal2(int n, int k) {
          return k == 0 | k == n ? 1 : pascal2(n - 1, k - 1) + pascal2( n - 1, k);
        }

        public static int fak(int n) {
          return n == 0 ? 1 : n * fak(n - 1);
        }

        public static int sum(int n){
          return n < 1 ? 0 : n + sum(n-1);
        }


        /*
        Die Funktion istPrimzahl(p) sei wie folgt mit Hilfe der rekursiven Funktion istPrimzahl(p, z) definiert:

          istPrimzahl(p) := istPrimzahl(p, p-1)
          istPrimzahl(p, 1) := true
          istPrimzahl(p, z) := false, falls p durch z teilbar ist
          istPrimzahl(p, z) := istPrimzahl(p, z - 1), falls p nicht durch z teilbar ist
         */

         private static boolean istPrimzahl(int p,int f) {
          if (f == 1) {
            return true;
          }
          if (p % f == 0) {
            return false;
          }
          return istPrimzahl(p, f - 1);
        }

        public static boolean istPrimzahl(int p) {
          if (p == 1) {
            return false;
          }
          return istPrimzahl(p, p - 1);
        }


        ////array

      //

       public static double[][] spaltentausch(double[][] i, double k, double m) {
          int s1 = 0;
          int s2 = 0;
           for (int z = 0; z < i.length; ++z) {
            for (int s = 0; s < i[z].length; ++s){
              if(i[z][s] == k) {
                s1 = s;
              }
              if(i[z][s] == m) {
                s2 = s;
              }
            }
          }
            double[][] rx = new double[i.length][i[0].length];

            for (int c = 0; c < i.length; ++c) {
              for (int r = 0; r < i[c].length; ++r){
                  if (r == s1) {
                    rx[c][s2] = i[c][s1];
                  } 
                  if (r == s2) {
                    rx[c][s1] = i[c][s2];
                  } else {
                    rx[c][r] = i[c][r];
                  }

                }
                }
              return rx;
           }
}



