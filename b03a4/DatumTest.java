
public class DatumTest {
  public static final String GREEN = "\u001B[32m";
  public static final String RED = "\u001B[31m";
  public static void main(String[] args) {
    int a = new java.util.Scanner(System.in).nextInt();
    int b = new java.util.Scanner(System.in).nextInt();
    while (a <= b) {
      if (Datum.istSchaltjahr(a)) {
        System.out.print(GREEN + a + " ");
      } else {
        System.out.print(RED + a + " ");
      }
      ++a;
    }
    
  }
  
}
