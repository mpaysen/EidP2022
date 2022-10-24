/*
 * @author mpayse2s
 * Class math with the method istSchaltjahr
 */
public class Datum {
  public static boolean istSchaltjahr(int a) {
    // Check if a is less than 1583:
    // If a / 4 without remainder return true.

    // If a is greater than or equal to 1583:
    // When a / 400 without remainder logical or
    // a / 4 without remainder logical and
    // not a / 100 without remainder then return true.
    return (a < 1583) ? (a % 4 == 0) : (a % 400 == 0) | ((a % 4 == 0) & !(a % 100 == 0));
  }
}
