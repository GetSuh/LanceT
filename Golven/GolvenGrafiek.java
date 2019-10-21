package Golven;

import java.awt.*;
import java.util.Random;

public class GolvenGrafiek {
    int aantalGolvenGetekend;
    Random randomObject;
    public GolvenGrafiek(int aantalGolvenGetekend){
        this.aantalGolvenGetekend = aantalGolvenGetekend;
        randomObject = new Random();

    }
    public void tekenGolven (){
        GrafiekWindow window = new GrafiekWindow(10,6);
        for (double i = -5.0;i<=5.0;i += 0.00001){
            Golf golf = new Golf();
            golf.setAmplitude(randomObject.nextInt( 4)+0.1);
            golf.setFrequentie(randomObject.nextInt(4)+0.1);
            window.tekenPunt(i,golf.getYwaarde(i), Color.BLUE);
        }
        window.toon();
    }
}
