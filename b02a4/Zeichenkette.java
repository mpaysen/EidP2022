/**
 * @author mpayse2s
 */
public class Zeichenkette {

  public static String grussMitZeit(int stunde, String name) {
    String zeit;
    if (stunde < 12) {
      zeit = "Morgen";
    } else if (stunde >= 18) {
      zeit = "Abend";
    } else {
      zeit = "Tag";
    }
    return ("Guten " + zeit + ", " + name + "!");
  }

  public static String zitronenEis(int n) {
    int i = 1;
    String strZ = "Z";
    String strSuper = "super";
    String outstrZ = strZ;
    String outstrSuper = strSuper;
    if (n == 0) {
      return ("leckeres " + "Zitroneneis");
    }
    while (i < n) {
      outstrSuper = outstrSuper + strSuper;
      outstrZ = outstrZ + strZ;
      i++;
    }
    return (outstrSuper + "leckeres " + outstrZ + "Zitroneneis");
  }

  public static String wiederhole(int n, String abc, char t) {
    int i  = 2;
    String strABC = abc + t;
    if (n == 0) {
      return ("");
    } else if (n == 1) {
      return (abc);
    } else {
      String strOut = strABC;
      while (i < n) {
        strOut = strOut + strABC;
        i++;
      }
      return (strOut + abc);
    }
  }
}
