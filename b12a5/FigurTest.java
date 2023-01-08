public class FigurTest {
  public static void main(String[] args) {

    Punkt2D m1 = new Punkt2D(1,1);
    Punkt2D m2 = new Punkt2D(0,-1);
    KreisPerMitteRadius k1 = new KreisPerMitteRadius(m1,0);
    Figur f1 = k1;
    KreisPerMitteRadius k2 = new KreisPerMitteRadius(m2,1);
    Figur f2 = k2;
    Punkt2D p1 = new Punkt2D(0.5,0.5);
    Punkt2D p2 = new Punkt2D(-1,0.5);
    f1.istEnthalten(p1);
    f2.istEnthalten(p2);
    f1.verschiebe(-0.5,-0.5);
    f2.verschiebe(-1,0.5);
    System.out.print(f1.mitte());
    
  }
}
