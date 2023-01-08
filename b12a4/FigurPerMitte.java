/*
 * @author mpayse2s
 */
public abstract class FigurPerMitte extends Figur {

  public FigurPerMitte(Punkt2D mitte) {
    super.setMitte(mitte);
  }

  public FigurPerMitte(FigurPerMitte p) {
    super.setMitte(p.mitte());
  }
}
