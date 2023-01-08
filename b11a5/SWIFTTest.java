public class SWIFTTest {

  public static void main(String[] args) {
    String iban = SWIFT.iban("de", 21763542, 5777526);
    System.out.println(iban);

    long m =Long.MAX_VALUE;
    System.out.println(m);

    System.out.println(SWIFT.pruefzahl("DE", SWIFT.bban(12345678,123456) ));

  }
  
}
