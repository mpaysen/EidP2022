/*
 * @author mpayse2s
 */
import java.util.Scanner;

public class Matrix {
  private int rows; //zeilen
  private int columns; //spalten
  private double[][] r;

  public Matrix() {

  }

  public Matrix(int n) {
    this(n, n);
  }

  public Matrix(int z, int s) {
    if (z <= 0 || s <= 0) {
      throw new IllegalArgumentException();
    }
    this.rows = z;
    this.columns = s;
    this.r = new double[rows][columns];
  }

  public Matrix(Matrix f) {
    if (f == null) {
      throw new NullPointerException();
    }
    this.r = new double[f.zeilen()][f.spalten()];
    this.rows = f.zeilen();
    this.columns = f.spalten();
    for (int z = 0; z < f.zeilen(); ++z) {
      for (int s = 0; s < f.spalten(); ++s) {
        this.set(z, s, f.get(z, s));
      }
    }
  }

  public int zeilen() {
    return this.rows;
  }

  public int spalten() {
    return this.columns;
  }

  public double get(int z, int s) {
    if (z >= this.rows || z < 0) {
      throw new IllegalArgumentException();
    } else if (s >= this.columns || s < 0) {
      throw new IllegalArgumentException();
    }
    return this.r[z][s];
  }

  public Matrix set(int z, int s, double e) {
    if (z >= this.rows || z < 0) {
      throw new IllegalArgumentException();
    } else if (s >= this.columns || s < 0) {
      throw new IllegalArgumentException();
    }
    try {
      this.r[z][s] = e;
    } catch (Exception ex) {
      throw new IllegalArgumentException();
    }
    return this;
  }

  public Matrix setAll(double e) {
    for (int z = 0; z < this.rows; ++z) {
      for (int s = 0; s < this.columns; ++s) {
        try {
          this.r[z][s] = e;
        } catch (Exception ex) {
          throw new IllegalArgumentException();
        }
      }
    }
    return this;
  }

  public Matrix setZeile(int z, double[] f) {
    if (f == null) {
      throw new NullPointerException();
    }
    if (this.zeilen() < f.length + 1) {
      throw new IllegalArgumentException();
    }
    if (z >= this.rows || z < 0) {
      throw new IllegalArgumentException();
    }
    try {
      for (int s = 0; s < this.columns; ++s) {
        this.r[z][s] = f[s];
      }
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }
    return this;
  }

  public Matrix setSpalte(int s, double[] f) {
    if (f == null) {
      throw new NullPointerException();
    }
    if (this.spalten() < f.length + 1) {
      throw new IllegalArgumentException();
    }
    if (s >= this.columns || s < 0) {
      throw new IllegalArgumentException();
    }
    try {
      for (int z = 0; z < this.rows; ++z) {
        this.r[z][s] = f[z];
      }
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }
    return this;
  }

  public boolean equals(Matrix m) {
    if (m == null) {
      throw new NullPointerException();
    }
    if (this.rows != m.zeilen() || this.columns != m.spalten()) {
      return false;
    } else {
      for (int z = 0; z < m.zeilen(); ++z) {
        for (int s = 0; s < m.spalten(); ++s) {
          if (!(Mathe.equals(this.r[z][s], m.get(z, s)))) {
            return false;
          }
        }
      }
      return true;
    }
  }

  public Matrix eingabe(java.util.Scanner sc) {
    int tmprows = 0;
    int tmpcolumns = 0;
    int doubles = 0;
    String str = "";
    try {
      while (sc.hasNext()) {
        String tmp = sc.next();
        if (tmp.equals("(")) {
          str += " { ";
          continue;
        } else if (tmp.equals(")")) {
          ++tmprows;
          str = str.substring(0, str.length() - 1);
          str += " }";
          continue;
        } else {
          ++doubles;
          str += tmp + " ";
        }
      }
    } catch (Exception e) {
      throw new java.util.InputMismatchException();
    }
    try {
      tmpcolumns = doubles / tmprows;
    } catch (Exception e) {
      throw new java.util.InputMismatchException();
    }
    if (this.rows != tmprows || this.columns != tmpcolumns) {
      throw new java.util.InputMismatchException();
    }
    this.rows = tmprows;
    this.columns = tmpcolumns;
    this.r = new double[tmprows][tmpcolumns];
    str = str.replace(",", ".");

    int s = 0;
    int z = 0;
    try {
      Scanner sc2 = new Scanner(str);
      while (sc2.hasNext()) {
        String tmp = sc2.next();
        if (tmp.equals("{")) {
          continue;
        } else if (tmp.equals("}")) {
          ++z;
          s = 0;
          continue;
        } else {
          double e = Double.parseDouble(tmp);
          this.set(z, s, e);
          ++s;
        }
      }
      sc2.close();
    } catch (Exception e) {
      throw new java.util.InputMismatchException();
    }
    return this;
  }

  @Override
  public String toString() {
    String str = "";
    for (int z = 0; z < this.rows; ++z) {
      str += "( ";
      for (int s = 0; s < this.columns; ++s) {
        str += (this.r[z][s] + " ");
      }
      str += ")\n";
    }
    return str;
  }
}
