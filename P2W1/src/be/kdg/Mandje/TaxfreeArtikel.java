package be.kdg.Mandje;

public class TaxfreeArtikel extends Artikel {


    public TaxfreeArtikel(int nummer, String beschrijving, double prijs) {
        super(nummer, beschrijving, prijs,0);

    }
    public double getTotalePrijs(){
        return getPrijs();
    }
    @Override
    public String toString() {
        return String.format("%d %s €%f %d%%",getNummer(),getBeschrijving(),getPrijs(),getBtwTarief());
    }
}
