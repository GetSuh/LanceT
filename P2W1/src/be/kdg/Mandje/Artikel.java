package be.kdg.Mandje;

public class Artikel {
    protected int nummer;
    protected String beschrijving;
    protected double prijs;
    protected int btwTarief;

    public Artikel(int nummer, String beschrijving, double prijs, int btwTariefInPercentage) {
        this.nummer = nummer;
        this.beschrijving = beschrijving;
        this.prijs = prijs;
        this.btwTarief = btwTarief;
    }

    public int getNummer() {
        return nummer;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public int getBtwTarief() {
        return btwTarief;
    }

    public double getTotalePrijs(){
        return prijs * (btwTarief /100);

    }
    public double getInvoerTaks(){
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("%d %s €%f %d%%",getNummer(),getBeschrijving(),getPrijs(),getBtwTarief());
    }
}
