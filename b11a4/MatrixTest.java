import java.util.Scanner;

public class MatrixTest {
  public static void main(String[] args) {
    Matrix q = new Matrix(3);
    q.setAll(8.0);
    double[] r = {1.0,2.0,3.0};
    q.setZeile(0, r);
    q.setSpalte(0, r);

    Matrix f = new Matrix(2);
    f.setAll(7.0);
    f.setZeile(0, r);
    f.setSpalte(1, r);

    System.out.println(f);

    //Scanner sc = new Scanner("( 1.0 1.0 5.0 )\n( 7.0 2.0 7.0 )");
    //Matrix m = new Matrix(2,3);
    //m.eingabe(sc);
    //System.out.println(m);

    //Matrix m = new Matrix(3,4);
    //m.setZeile(0,new double[]{-4,1});

    Matrix m1 = new Matrix(3,4);
    m1.set(0,0,5.0);
    m1.set(0,1,3.0);
    m1.set(0,2,8.0);
    m1.set(0,3,1.0);
    m1.set(1,0,-4.0);
    m1.set(1,1,8.0);
    m1.set(1,2,4.0);
    m1.set(1,3,2.0);
    m1.set(2,0,-1.0);
    m1.set(2,1,6.0);
    m1.set(2,2,-3.0);
    m1.set(2,3,7.0);
    Matrix m2 = new Matrix(m1);
    System.out.println(m1);
    System.out.println(m2);

    
  }
}
