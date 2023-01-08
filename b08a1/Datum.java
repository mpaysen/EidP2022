/**
 * @author mpayse2s
 */
public class Datum {
  private int day;
  private int month;
  private int year;
  public static String format = "jmt";
  public static char seperator = '-';

  public static void setFormatRF(String s) {
    format = s;
  }

  public static void setFormatTZ(char c) {
    seperator = c;
  }

  public Datum() {
    this(1, 1, 1);
  }

  public Datum(int y) {
    this(y, 1, 1);
  }

  public Datum(int y, int m) {
    this(y, m, 1);
  }

  public Datum(int y, int m, int d) {
    day = d;
    month = m;
    year = y;
  }

  public Datum(Datum date) {
    this.day = date.day;
    this.month = date.month;
    this.year = date.year;
  }

  public int tag() {
    return this.day;
  }

  public int monat() {
    return this.month;
  }

  public int jahr() {
    return this.year;
  }


  public boolean equals(Datum date) {
    return (tag() == date.day && monat() == date.month && jahr() == date.year);
  }

 
  public boolean istFrueher(Datum date) {
    return  ((tag() < date.day && monat() <= date.month && jahr() <= date.year)
            || (monat() < date.month && jahr() <= date.year)
            || (jahr() < date.year)
            );
  }

  @Override
  public String toString() {
    String j = String.format("%04d", jahr());
    String m = String.format("%02d", monat());
    String t = String.format("%02d", tag());
    String s = String.valueOf(seperator);

    String date = switch (format) {
      case "jmt" -> String.join(s, j , m ,t);
      case "tmj" -> String.join(s, t , m ,j);
      case "mtj" -> String.join(s, m , t ,j);
      default -> "Usage: jmt/tmj/mtj";
    };

   
    return date;
  }

}

