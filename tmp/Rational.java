public class Rational {
	// Attribute
	int zaehler;
	int nenner;

	// Konstruktor 1
	// Eine Ganzzahl x zu Bruch umstellen (x/1)
	public Rational(int x) {
		zaehler = x;
		nenner = 1;
	}

	// Konstruktor 2
	// Zwei Ganzzahlen x,y als Bruch darstellen (x/y)
	public Rational(int x, int y) {
		if(y != 0) {
		int ggT = ggT(x, y);
		if (y < 0) {
			x = x * (-1);
			y = y * (-1);
		}
		zaehler = (x / ggT);
		nenner = (y / ggT);
		} else {
			System.out.println("Fehler: Nenner ist 0");
		}
	}

	// Methode 01 - Kuerzen(ggT)
	public static int ggT(int x, int y) {
		int ggTx = x;
		if (x < 0) {
			ggTx = ggTx * (-1);
		}
		int ggTy = y;
		if (y < 0) {
			ggTy = ggTy * (-1);
		}
		if (ggTx == 0) {
			return ggTy;
		} else {
			while (ggTy != 0) {
				if (ggTx > ggTy) {
					ggTx = ggTx - ggTy;
				} else {
					ggTy = ggTy - ggTx;
				}
			}
		}

		return ggTx;
	}

	// Methode 02 - String erzeugen / zurückgeben
	public String toString() {
		return  (this.zaehler) + "/" + (this.nenner);
	}

	// Methode 03 - Addieren
	public Rational add(Rational sum) {
		int zaehlersumme = 0;
		int nennersumme = 0;
		int zaehlerhilfeadd = 0;

		if (this.nenner != sum.nenner) {
			zaehlersumme = (this.zaehler) * (sum.nenner);
			nennersumme = (this.nenner) * (sum.nenner);
			zaehlerhilfeadd = (sum.zaehler) * (this.nenner);
			zaehlersumme = zaehlersumme + zaehlerhilfeadd;

		} else {
			zaehlersumme = (this.zaehler) + (sum.zaehler);
			nennersumme = (this.nenner);
		}
		Rational summe = new Rational(zaehlersumme, nennersumme);
		return summe;
	}

	// Methode 04 - Subtrahieren
	public Rational sub(Rational dif) {
		int zaehlerdifferenz = 0;
		int nennerdifferenz = 0;
		int zaehlerhilfesub = 0;

		if (this.nenner != dif.nenner) {
			zaehlerdifferenz = (this.zaehler) * (dif.zaehler);
			nennerdifferenz = (this.nenner) * (dif.nenner);
			zaehlerhilfesub = (dif.zaehler) * (this.nenner);
			zaehlerdifferenz = zaehlerdifferenz - zaehlerhilfesub;
		} else {
			zaehlerdifferenz = (this.zaehler) - (dif.zaehler);
			nennerdifferenz = (this.nenner);
		}
		Rational differenz = new Rational(zaehlerdifferenz, nennerdifferenz);
		return differenz;
	}

	// Methode 05 - Multiplizieren
	public Rational mul(Rational pro) {
		int zaehlerprodukt = (this.zaehler) * (pro.zaehler);
		int nennerprodukt = (this.nenner) * (pro.nenner);
		Rational produkt = new Rational(zaehlerprodukt, nennerprodukt);
		return produkt;

	}

	// Methode 06 - Dividieren
	public Rational div(Rational quo) {
		int zaehlerquotient = (this.zaehler) * (quo.nenner);
		int nennerquotient = (this.nenner) * (quo.zaehler);
		Rational quotient = new Rational(zaehlerquotient, nennerquotient);
		return quotient;
	}
}
