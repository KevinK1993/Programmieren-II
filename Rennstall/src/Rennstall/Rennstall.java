package Rennstall;

public class Rennstall {

	private String teamname;
	private String sponsor;
	private int anzahlWagen;

	public Rennstall(String teamname, String sponsor, int anzahlWagen) {
		super();
		this.teamname = teamname;
		this.sponsor = sponsor;
		this.anzahlWagen = anzahlWagen;
	}

	public String ausgabe() {
		return "Hier befindet sich das Team " + this.teamname
				+ ". Der Rennstall besteht aus " + this.anzahlWagen
				+ " Rennwagen und wrd gesponsort durch " + this.sponsor + ".";
	}

	/**
	 * @return the teamname
	 */
	public String getTeamname() {
		return teamname;
	}

	/**
	 * @param teamname
	 *            the teamname to set
	 */
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	/**
	 * @return the sponsor
	 */
	public String getSponsor() {
		return sponsor;
	}

	/**
	 * @param sponsor
	 *            the sponsor to set
	 */
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	/**
	 * @return the anzahlWagen
	 */
	public int getAnzahlWagen() {
		return anzahlWagen;
	}

	/**
	 * @param anzahlWagen
	 *            the anzahlWagen to set
	 */
	public void setAnzahlWagen(int anzahlWagen) {
		this.anzahlWagen = anzahlWagen;
	}

	public static void main(String[] args) {
		Rennstall rennstall1 = new Rennstall("Jens", "Telekom", 3);
		System.out.println(rennstall1.ausgabe());

		System.out.println("Piloten:");
		Pilot pilot1 = new Pilot("Mustermann", "Max", "Deutsch", 1, 4);
		Pilot pilot2 = new Pilot("Miller", "Steven", "Britisch", 2, 0);
		Pilot pilot3 = new Pilot("Bauer", "Reinhard", "Deutsch", 3, 2);
		System.out.println(pilot1.ausgabe()
				+ " Das Saisongehalt des Piloten liegt aktuell bei "
				+ pilot1.saisongehaltBerechnen() + "");
		System.out.println(pilot2.ausgabe()
				+ " Das Saisongehalt des Piloten liegt aktuell bei "
				+ pilot1.saisongehaltBerechnen() + "");
		System.out.println(pilot3.ausgabe()
				+ " Das Saisongehalt des Piloten liegt aktuell bei "
				+ pilot1.saisongehaltBerechnen() + "");

		System.out.println("Mechaniker:");
		Mechaniker mechaniker1 = new Mechaniker("Michalke", "Jens", "Deutsch",
				"Reifen");
		Mechaniker mechaniker2 = new Mechaniker("Papadopolus", "Janis",
				"Griechisch", "Aerodynamik");
		System.out.println(mechaniker1.ausgabe()
				+ " Das Saisongehalt des Mechanikers liegt aktuell bei "
				+ pilot1.saisongehaltBerechnen() + "");
		System.out.println(mechaniker2.ausgabe()
				+ " Das Saisongehalt des Mechanikers liegt aktuell bei "
				+ pilot1.saisongehaltBerechnen() + "");

		System.out.println("Rennwagen:");
		Rennwagen rennwagen1 = new Rennwagen(1, true, pilot2);
		Rennwagen rennwagen2 = new Rennwagen(2, false, pilot1);
		Rennwagen rennwagen3 = new Rennwagen(3, true, pilot3);
		System.out.println(rennwagen1.ausgabe());
		System.out.println(rennwagen2.ausgabe());
		System.out.println(rennwagen3.ausgabe());
	}

}
