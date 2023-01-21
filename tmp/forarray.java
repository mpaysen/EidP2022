public class forarray {

  public static void main(String[] args) {
    int[] f = {1,2,3,4};
    System.out.println(umkehren(f));
  }

  public static int[] umkehren(int[] f) {
    int[] r = new int[f.length];
    for (int i = 0; i < f.length; i++) {
      r[i] = f[(f.length - 1) - i];
    }
    int[][] array = {{3},{5}};
    return r;
    
  }
}
