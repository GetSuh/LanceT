package be.kdg.Werknemer;

public class TestWerknemer {
    public static void main(String[] args) {
        Werknemer[] werknemers = {
                new Arbeider("Jos", 57082332149L, 38),
                new Arbeider("Els", 61030350468L, 40),
                new Bediende("Erik", 54110774131L, 1.6)
        };

        for (Werknemer werknemer : werknemers) {
            System.out.println(werknemer.toString());
        }double som = 0;
        for (Werknemer werknemer : werknemers) {

            som += werknemer.getLoon();
        }
        System.out.println("Som lonen: €" + som);

    }
}
