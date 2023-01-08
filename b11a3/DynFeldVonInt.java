/*
 * @author mpayse2s
 */
public class DynFeldVonInt {
  private int length = 0;
  private int[] r;

  public DynFeldVonInt() {
    this(0);
  }

  public DynFeldVonInt(int i) {
    if (i < 0) {
      throw new IllegalArgumentException();
    }
    this.length = i;
    this.r = new int[length];
  }

  public int length() {
    return this.length;
  }

  public int get(int i) {
    if (i < 0 || i >= this.length) {
      throw new IndexOutOfBoundsException();
    }
    return this.r[i];
  }

  public void set(int i, int v) {
    if (i < 0 || i >= this.length) {
      throw new IndexOutOfBoundsException();
    }
    int[] tmp = new int[this.r.length];
    for (int f = 0; f < this.r.length; ++f) {
      tmp[f] = this.r[f];
    }

    if (this.length <= i) {
      this.length = i + 1;
      this.r = new int[this.length];
    }

    for (int f = 0; f < tmp.length; ++f) {
      this.r[f] = tmp[f];
    }
    this.r[i] = v;
  }

  public void insert(int i, int k) {
    if (i < 0) {
      throw new IndexOutOfBoundsException();
    } else if (k < 0) {
      throw new IllegalArgumentException();
    }
    int[] tmpbefore = new int[i];
    int[] tmpafter = new int[this.r.length - i];

    for (int f = 0; f < i; ++f) {
      tmpbefore[f] = this.r[f];
    }
    for (int f = 0; f < this.r.length - i; ++f) {
      tmpafter[f] = this.r[f + i];
    }
    this.length = length + k;
    this.r = new int[this.length];

    for (int f = 0; f < tmpbefore.length; ++f) {
      this.r[f] = tmpbefore[f];
    }

    for (int f = i + k; f < this.r.length;) {
      for (int h = 0; h < tmpafter.length; ++h, ++f) {
        this.r[f] = tmpafter[h];
      }
    }

  }

  public void remove(int i, int k) {
    if (i < 0 || i >= this.length) {
      throw new IndexOutOfBoundsException();
    } else if (k < 0) {
      throw new IllegalArgumentException();
    }
    int[] tmpbefore = new int[i];
    int[] tmpafter = new int[this.r.length - i];
    try {
      for (int f = 0; f < i; ++f) {
        tmpbefore[f] = this.r[f];
      }
      for (int f = 0; f < this.r.length - i; ++f) {
        tmpafter[f] = this.r[f + i];
      }
      this.length = length - k;
      this.r = new int[this.length];

      for (int f = 0; f < tmpbefore.length; ++f) {
        this.r[f] = tmpbefore[f];
      }

      for (int f = i; f < this.r.length;) {
        for (int h = k; h < tmpafter.length; ++h, ++f) {
          this.r[f] = tmpafter[h];
        }
      }
    } catch (Exception e) {
      throw new IllegalArgumentException();
    }
  }

  public boolean equals(DynFeldVonInt f) {
    if (this.length != f.length) {
      return false;
    } else {
      for (int i = 0; i < this.length; ++i) {
        if (f.get(i) != this.r[i]) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public String toString() {
    String str = "";
    for (int i = 0; i < this.r.length; ++i) {
      str += (this.r[i] + ",");
    }
    if (this.r.length > 0) {
      str = str.substring(0, (str.length() - 1));
    }
    return "[" + str + "]";
  }
}
