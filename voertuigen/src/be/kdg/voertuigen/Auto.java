package be.kdg.voertuigen;

public class Auto extends Voertuig {
    private int aantalDeuren;

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }

    public Auto(String kleur, String merk, int aantalDeuren) {
        super(kleur,merk);
        this.aantalDeuren = aantalDeuren;

    }

    @Override
    public String toString() {
        return super.toString() +
                " aantalDeuren= " + aantalDeuren
                ;
    }
}
