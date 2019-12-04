package be.kdg.Werknemer;

public class Bediende extends Werknemer {
    private static final int LOONFACTOR = 192;

    private double weddeBarema;

    public Bediende(String naam, long rijksregisternummer,double weddeBarema) {
        super(naam, rijksregisternummer);
        this.weddeBarema = weddeBarema;
    }





    @Override
    public double getLoon() {
        return Arbeider.UURLOON *LOONFACTOR * weddeBarema;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s\nNummer: %d\nLoon: %.1f",super.naam,super.rijksregisternummer,getLoon());
}
}
