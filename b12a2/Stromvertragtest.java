public class Stromvertragtest {

  public static void main(String[] args) {
    Stromvertrag f = new Stromvertrag("Test", 3, 42539);
    System.out.println(f.kostenFix(5));
    System.out.println(f.kostenVariabel(5,1100));
    System.out.println(f.rechnung(8,43639));
    System.out.println(Stromvertrag.anzahl);
  }
  
}
