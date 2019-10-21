package Golven;

public class GolfTest {
    public static void main(String[] args) {

        for (double i = 1; i <= 5; i = i + 0.5) {
            Golf golf1 = new Golf();
            golf1.setAmplitude(i);
            System.out.println(golf1);
        }
        GolvenGrafiek golvenGrafiek = new GolvenGrafiek(5);
        golvenGrafiek.tekenGolven();

    }
}
