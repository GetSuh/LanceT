package be.kdg.voertuigen;

public class Main {
    public static void main(String[] args) {
        Voertuig voertuig = new Voertuig("BMW","Zwart");
        System.out.println(voertuig);
        Auto auto = new Auto("rood","Audi",4);
        Auto [] autos = new Auto[3];
        Vliegtuig vliegtuig = new Vliegtuig("Wit","Boeing",150,30000);
        System.out.println(vliegtuig);
        Voertuig[] voertuigen = new Voertuig[3];
        voertuigen[0] = voertuig;
        voertuigen[1] = auto;
        voertuigen[2] = vliegtuig;
        for (Voertuig voertuig1 : voertuigen) {
            System.out.println(voertuig1);

        }



    }
}
