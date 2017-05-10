package Rennstall;

public class Pilot extends Teammitglied {

	private int pilotenNummer;
	private int anzahlSiege;

	public Pilot(String name, String vorname, String nationalitaet,
			int pilotenNummer, int anzahlSiege) {
		super(name, vorname, nationalitaet);
		this.pilotenNummer = pilotenNummer;
		this.anzahlSiege = anzahlSiege;
	}

	public int saisongehaltBerechnen() {
		return 100000 * 9 + 50000 * anzahlSiege;
	}

	public String ausgabe() {
		return "Der Pilot " + this.getVorname() + " " + this.getName()
				+ " hat die Nummer " + this.pilotenNummer
				+ " und holte in der letzten Saison" + anzahlSiege
				+ " Siege.";
	}

	/**
	 * @return the pilotenNummer
	 */
	public int getPilotenNummer() {
		return pilotenNummer;
	}

	/**
	 * @param pilotenNummer
	 *            the pilotenNummer to set
	 */
	public void setPilotenNummer(int pilotenNummer) {
		this.pilotenNummer = pilotenNummer;
	}

	/**
	 * @return the anzahlSiege
	 */
	public int getAnzahlSiege() {
		return anzahlSiege;
	}

	/**
	 * @param anzahlSiege
	 *            the anzahlSiege to set
	 */
	public void setAnzahlSiege(int anzahlSiege) {
		this.anzahlSiege = anzahlSiege;
	}

}
