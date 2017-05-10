package Rennstall;

public class Rennwagen {

	private int wagenNummer;
	private boolean defekt;
	private Pilot p;

	public Rennwagen(int wagenNummer, boolean defekt, Pilot p) {
		super();
		this.wagenNummer = wagenNummer;
		this.defekt = defekt;
		this.p = p;

	}

	public String ausgabe() {

		if (this.defekt) {
			if (p != null) {
				return "Der Rennwagen hat die Wagennummer " + this.wagenNummer
						+ ", gehört dem Piloten " + p.getPilotenNummer()
						+ " und ist defekt.";
			} else {
				return "Der Rennwagen hat die Wagennummer " + this.wagenNummer
						+ ", gehört keinem Piloten und ist defekt.";
			}
		} else {
			if (p != null) {
				return "Der Rennwagen hat die Wagennummer " + this.wagenNummer
						+ ", gehört dem Piloten " + p.getPilotenNummer()
						+ " und ist nicht defekt.";
			} else {
				return "Der Rennwagen hat die Wagennummer " + this.wagenNummer
						+ ", gehört keinem Piloten und ist nicht defekt.";
			}
		}

	}

	/**
	 * @return the wagenNummer
	 */
	public int getWagenNummer() {
		return wagenNummer;
	}

	/**
	 * @param wagenNummer
	 *            the wagenNummer to set
	 */
	public void setWagenNummer(int wagenNummer) {
		this.wagenNummer = wagenNummer;
	}

	/**
	 * @return the istDefekt
	 */
	public boolean isIstDefekt() {
		return defekt;
	}

	/**
	 * @param istDefekt
	 *            the istDefekt to set
	 */
	public void setIstDefekt(boolean istDefekt) {
		this.defekt = istDefekt;
	}

	/**
	 * @return the p
	 */
	public Pilot getP() {
		return p;
	}

	/**
	 * @param p
	 *            the p to set
	 */
	public void setP(Pilot p) {
		this.p = p;
	}

}
