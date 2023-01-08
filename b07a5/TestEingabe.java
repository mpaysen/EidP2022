import java.io.PrintStream;
import java.util.Scanner;

public class TestEingabe {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintStream ps = new PrintStream(System.out);
    System.out.print("Eingabe: ");
    Eingabe.filter(sc,ps,"a","two","four");
    sc.close();
  }
}
