import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {

  public static void main(String[] args) {
    game();
  }


  public static void game(){
    Scanner sc = new Scanner(System.in);
    Feld f = new Feld();
    boolean player = false;

    while(true) {
    System.out.println(f);
    if (player) {
      System.out.println("Spieler 1. mit x!");
      try {
        input(sc, 'x', f);
        } catch (IllegalArgumentException e) {
          continue;
        }
      player = !player;
      flush();
      clearConsole();
    } else {
      System.out.println("Spieler 2. mit o!");
      try {
        input(sc, 'o', f);
        } catch (IllegalArgumentException e) {
          continue;
        }
      player = !player;
      flush();
      clearConsole();
    }
    if (f.check('o')) {
      System.out.println("Spieler 2. mit o hat Gewonnen!");
      sc.close();
      System.out.println(f);
      break;
    } else if (f.check('x')) {
      System.out.println("Spieler 1. mit x hat Gewonnen!");
      sc.close();
      System.out.println(f);
      break;
    }
    }

  }

  public static void input(Scanner sc, char sign, Feld f) {
    System.out.print("Koordinate von \"Zeile[1-3] Spalte[1-3]\" eingeben:  ");
    int r = 4;
    int c = 4;
    try {
      r = sc.nextInt();
      c = sc.nextInt();
      f.set(r,c, sign);
    } catch (Exception e) {
      flush();
      clearConsole();
      System.err.println("Eingabe nicht Korrekt: " + e);
      throw e;
    }
  }

  public static void flush(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void clearConsole() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else {
            System.out.print("\033\143");
        }
    } catch (IOException | InterruptedException ex) {}
}

}
