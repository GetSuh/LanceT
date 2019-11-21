package be.kdg.voertuigen;

public class PassagiersVoertuig extends Voertuig {
    private int aantalPassagiers;

    public PassagiersVoertuig(String kleur, String merk, int aantalPassagiers) {
        super(kleur, merk);
        this.aantalPassagiers = aantalPassagiers;
    }

    @Override
    public String toString() {
        return super.toString() +
                "aantalPassagiers= " + aantalPassagiers
                ;
    }
}
