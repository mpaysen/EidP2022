import java.util.Arrays;

public class TestFeld {
  static int[] f = {1,2,3,4,5};
  public static void main(String[] args) {
    Feld.umkehrenInPlace(f);
    System.out.println(Arrays.toString(f));
  }
  
}
