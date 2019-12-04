package be.kdg.Mandje;

public class ImportArtikel extends Artikel {
    private double invoerTaks;

    public ImportArtikel(int nummer, String beschrijving, double prijs, int btwTariefInPercentage,double invoerTaks) {
        super(nummer, beschrijving, prijs, btwTariefInPercentage);
        this.invoerTaks = invoerTaks;
    }

    @Override
    public double getInvoerTaks() {
        return invoerTaks;
    }

    @Override
    public String toString() {
        return String.format("%d %s €%f %d%%",getNummer(),getBeschrijving(),getPrijs(),getBtwTarief());
    }
}
