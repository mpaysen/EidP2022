import java.util.Scanner;

public class TestEingabe {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("String to search: ");
    String s = sc.next();
    System.out.print("String: ");
    System.out.println(Eingabe.zaehlen(sc, s));
    sc.close();
  }
}
