package be.kdg.voertuigen;

public class Fiets extends Voertuig {
    private String type; // Mountainbike,Citybike,Koersfiets

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Fiets(String kleur, String merk, String type) {
        super(kleur, merk);
        this.type = type;

    }

    @Override
    public String toString() {
        return super.toString()+
                "type= '" + type + '\''
                ;
    }
}
