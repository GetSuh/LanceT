package Golven;

public class Golf {
    private double amplitude ;
    private double frequentie;

    public Golf() {
        this.amplitude = 1.0;
        this.frequentie = 1.0;
    }


    public void setAmplitude(double amplitude) {
        if (amplitude != 0) {
            this.amplitude = amplitude;
        }

    }

    public void setFrequentie(double frequentie) {
        if (frequentie != 0) {
            this.frequentie = frequentie;
        }
    }

    public double getYwaarde(double x) {
        return amplitude * Math.sin(frequentie * x);
    }

    public String toString() {
        String format;
        if (amplitude == 1) {
            format = String.format("y =  sin ( %2.1f x) ", this.frequentie);
        }
        else if(frequentie == 1){
            format = String.format("y =%2.1f  sin ( x) ", this.amplitude);
        }
        else if (amplitude == 1 && frequentie == 1){
            format = String.format("y =  sin (x) ", this.amplitude,this.frequentie);
        }
        else
        {
            format = String.format("y =%2.1f sin ( %2.1f x) ", this.amplitude,this.frequentie);
        }
        return format;
    }
}
