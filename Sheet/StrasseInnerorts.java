public final class StrasseInnerorts extends Strasse {
  private final static int vmaxRed = 8; //keine Magicnumbers
  private final static int vmaxNorm = 13;
  private final int vmax;

  public StrasseInnerorts(int laenge, boolean istReduziert) {
    super(laenge);
    vmax = istReduziert ? vmaxRed : vmaxNorm;
  }
  public final int vmax() {
    return vmax;
  }
}