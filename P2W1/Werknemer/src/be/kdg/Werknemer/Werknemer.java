package be.kdg.Werknemer;

public abstract class Werknemer {
    public static final double UURLOON = 12.5;

    protected String naam;
    protected long rijksregisternummer;

    public Werknemer(String naam, long rijksregisternummer) {
        this.naam = naam;
        this.rijksregisternummer = rijksregisternummer;
    }

    public abstract double getLoon();

    @Override
    public String toString() {
        return
                "naam: " + naam + "\n" +
                "rijksregisternummer: " + rijksregisternummer ;
    }
}
