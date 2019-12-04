package be.kdg.Werknemer;

public class Arbeider extends Werknemer {
    private static final int MAX_UREN_PER_WEEK = 38;

    private int aantalUren;



    public Arbeider(String naam, long rijksregisternummer,int aantalUren) {
        super(naam, rijksregisternummer);
        this.aantalUren = aantalUren;
    }

    @Override
    public double getLoon() {
        if (aantalUren > MAX_UREN_PER_WEEK){
            return (Werknemer.UURLOON * MAX_UREN_PER_WEEK)+((aantalUren-MAX_UREN_PER_WEEK)*1.5*(UURLOON));
        }else return Werknemer.UURLOON * aantalUren;

    }

    @Override
    public String toString() {
        return String.format("Naam: %s\nNummer: %d\nLoon: %.1f",super.naam,super.rijksregisternummer,getLoon());
    }
}
