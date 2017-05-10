package Rennstall;

public class Mechaniker extends Teammitglied {

	private String spezialgebiet;

	public Mechaniker(String name, String vorname, String nationalitaet,
			String spezialgebiet) {
		super(name, vorname, nationalitaet);
		this.spezialgebiet = spezialgebiet;
	}

	public int saisongehaltBerechnen() {
		return 25000 * 9;
	}

	public String ausgabe() {
		return "Der Mechaniker " + this.getVorname() + " " + this.getName()
				+ " ist Spezialist für " + this.spezialgebiet + ".";
	}

	/**
	 * @return the spezialgebiet
	 */
	public String getSpezialgebiet() {
		return spezialgebiet;
	}

	/**
	 * @param spezialgebiet
	 *            the spezialgebiet to set
	 */
	public void setSpezialgebiet(String spezialgebiet) {
		this.spezialgebiet = spezialgebiet;
	}

}
