package be.kdg.voertuigen;

public class Vliegtuig extends PassagiersVoertuig {

    private int maximaleHoogte;


    public int getMaximaleHoogte() {
        return maximaleHoogte;
    }

    public void setMaximaleHoogte(int maximaleHoogte) {
        this.maximaleHoogte = maximaleHoogte;
    }

    public Vliegtuig(String kleur, String merk, int aantalPassagiers, int maximaleHoogte) {
        super(kleur, merk, aantalPassagiers);
        this.maximaleHoogte = maximaleHoogte;

    }

    @Override
    public String toString() {
        return super.toString()+
                "maximaleHoogte= " + maximaleHoogte
                ;
    }
}
