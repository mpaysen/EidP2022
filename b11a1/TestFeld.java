import java.util.Arrays;

public class TestFeld {
  static int[] f = {};
  static int[] g = {};
  public static void main(String[] args) {
    int[] a = Feld.max(f,g);
    System.out.println(Arrays.toString(a));
  }
  
}
