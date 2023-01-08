public class foreach {
  public static void main(String[] args) {
    
    int[] array = { 125, 132, 95, 116, 110 };

    for (int i=0; i < array.length; i++) {
    System.out.println(array[i]);
    }

    for (int i : array) {
    System.out.println(i);
    }

  }
}
