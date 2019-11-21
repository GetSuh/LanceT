package be.kdg.voertuigen;

public class Voertuig {
    private String kleur;
    private String merk;



    public Voertuig(String kleur, String merk) {
        this.kleur = kleur;
        this.merk = merk;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    @Override
    public String toString() {
        return "Merk:" + merk + ",kleur : " + kleur + " ";
    }
}
