package Rennstall;

public abstract class Teammitglied {

	private String name;
	private String vorname;
	private String nationalitaet;

	public Teammitglied(String name, String vorname, String nationalitaet) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.nationalitaet = nationalitaet;
	}

	public abstract int saisongehaltBerechnen();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the vorname
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * @param vorname
	 *            the vorname to set
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * @return the nationalitaet
	 */
	public String getNationalitaet() {
		return nationalitaet;
	}

	/**
	 * @param nationalitaet
	 *            the nationalitaet to set
	 */
	public void setNationalitaet(String nationalitaet) {
		this.nationalitaet = nationalitaet;
	}
}
