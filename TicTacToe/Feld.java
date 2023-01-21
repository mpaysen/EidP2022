public class Feld {
  char[][] array;

  public Feld() {
    this.array = new char[3][3];
  }

  public void set(int row, int colum, char sign) {
    if (row < 1 | colum < 1 | row > 3 | colum > 3 & (sign != 'x' | sign != 'o')) {
      throw new IllegalArgumentException();
    }
    if ((this.array[row - 1][colum - 1] == 'x') | (this.array[row - 1][colum - 1] == 'o')) {
      throw new IllegalArgumentException("Dieses Feld wurde schon beschrieben.");
    } else {
      this.array[row - 1][colum - 1] = sign;
    }
  }

  public void reset() {
    this.array = new char[3][3];
  }

  public String toString() {
    String str = "+-1-+-2-+-3-+" + "\n";
    for (int r = 0; r < this.array.length; ++r) {
      str += (r + 1);
      for (int c = 0; c < this.array[0].length; ++c) {
        if (this.array[r][c] == 'x') {
          str += " " + "x" + " |";
        } else if (this.array[r][c] == 'o'){
          str += " " + "o" + " |";
        } 
        else str += " " + " " + " |";
      }
      str += "\n";
      str += "+---+---+---+" + "\n";
    }
    return str;
  }

  public boolean check(char sign) {

    for (int r = 0; r < this.array.length; ++r) {
      int ccount = 0;
      int rcount = 0;
      int d1count = 0;
      int d2count = 0;
      for (int c = 0; c < this.array[0].length; ++c) {
        if (this.array[r][c] == sign) {
          ++ccount;
        }
        if (ccount == 3) {
          return true;
        }

        if (this.array[c][r] == sign) {
          ++rcount;
        }
        if (rcount == 3) {
          return true;
        }
        if (this.array[c][c] == sign) {
          ++d1count;
        }
        if (d1count == 3) {
          return true;
        }
        if (this.array[c][2-c] == sign) {
          ++d2count;
        }
        if (d2count == 3) {
          return true;
        }
      }

    }
    return false;
  }
}