import java.util.Scanner;

public class MatrixTest {
  public static void main(String[] args) {
    Matrix m = new Matrix(3,4);
    m.setSpalte(0,new double[]{-4,1,3});
    System.out.println(m);

    
  }
}
