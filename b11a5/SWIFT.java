/*
 * @author mpayse2s
 */
public class SWIFT {

  public static String iban(String lk, int blz, long kn) {
    String pz = pruefzahl(landeskuerzel(lk), bban(blz, kn));
    return landeskuerzel(lk) + pz + bankleitzahl(blz) + kontonummer(kn);
  }

  public static String landeskuerzel(String lk) {
    if (lk.length() != 2) {
      throw new IllegalArgumentException();
    }
    try {
      lk = lk.toUpperCase();
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }
    if (lk.charAt(0) < 'A' || lk.charAt(0) > 'Z') {
      throw new IllegalArgumentException();
    }
    if (lk.charAt(1) < 'A' || lk.charAt(1) > 'Z') {
      throw new IllegalArgumentException();
    }
    return lk;
  }

  public static String bankleitzahl(int blz) {
    if (blz <= 0) {
      throw new IllegalArgumentException();
    }
    String str = "";
    str += blz;
    if (str.length() != 8) {
      throw new IllegalArgumentException();
    }
    return str;
  }

  public static String kontonummer(long kn) {
    if (kn <= 0) {
      throw new IllegalArgumentException();
    }
    String str = "";
    str += kn;
    if (str.length() > 10) {
      throw new IllegalArgumentException();
    }
    while (str.length() < 10) {
      str  = 0 + str;
    }
    return str;
  }

  public static String bban(int blz, long kn) {
    return bankleitzahl(blz) + kontonummer(kn);
  }

  public static int zahlFuerUpper(char c) {
    if (c < 'A' || c > 'Z') {
      throw new IllegalArgumentException();
    }
    int z = c - 'A' + 10;
    return z;
  }

  public static String bbanErgaenzung(String lk) {
    if (lk.length() != 2) {
      throw new IllegalArgumentException();
    }
    if (lk.charAt(0) < 'A' || lk.charAt(0) > 'Z') {
      throw new IllegalArgumentException();
    }
    if (lk.charAt(1) < 'A' || lk.charAt(1) > 'Z') {
      throw new IllegalArgumentException();
    }
    char c1 = lk.charAt(0);
    char c2 = lk.charAt(1);

    return "" + zahlFuerUpper(c1) + zahlFuerUpper(c2) + "00";

  }

  public static long zahlAlsStringMod97(String bban) {
    if (bban.length() > 24 || bban.length() <= 0) {
      throw new IllegalArgumentException();
    }
    String bbant = bban.substring(0, 9);
    bban = bban.substring(9);
    long z = Long.parseLong(bbant);
    long m = z % 97;


    bbant = m + bban;
    bban = bbant.substring(9);
    bbant = bbant.substring(0, 9);
    z = Long.parseLong(bbant);
    m = z % 97;

    bbant = m + bban;
    bban = bbant.substring(9);
    bbant = bbant.substring(0, 9);
    z = Long.parseLong(bbant);
    m = z % 97;

    bbant = m + bban;
    z = Long.parseLong(bbant);
    m = z % 97;

    return m;

  }

  public static String pruefzahl(String lk, String bban) {
    lk = landeskuerzel(lk);
    long r = zahlAlsStringMod97(bban + bbanErgaenzung(lk));
    String str = "";
    r = 98 - r;
    str += r;
    if (str.length() < 2) {
      str = "0" + str;
    }
    return str;
  }
}
