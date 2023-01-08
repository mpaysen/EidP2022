public class TestMensch {

  public static void main(String[] args) {
    Mann test = new Mann("Helmut", 16, 181, 81);
    Frau Zazie = new Frau("Zazie Queneau",67,157,65);
    Frau test2 = new Frau("Gabriele", 73, 178, 67);
    System.out.println(test);
    System.out.println(Zazie.preisHaarschnitt());
    System.out.println(test2);
    System.out.println(Mensch.anzahl());
    System.out.println(Frau.anzahl());
    System.out.println(Mann.anzahl());
  }
  
}
