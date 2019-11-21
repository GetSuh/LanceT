package be.kdg.voertuigen;

public class Bus extends PassagiersVoertuig {
    private int lijnNummer;

    public int getLijnNummer() {
        return lijnNummer;
    }

    public void setLijnNummer(int lijnNummer) {
        this.lijnNummer = lijnNummer;
    }

    public Bus(String kleur, String merk, int aantalPassagiers, int lijnNummer) {
        super(kleur, merk,aantalPassagiers);
        this.lijnNummer = lijnNummer;

    }

    @Override
    public String toString() {
        return super.toString() +
                "lijnNummer= " + lijnNummer
                ;
    }
}
