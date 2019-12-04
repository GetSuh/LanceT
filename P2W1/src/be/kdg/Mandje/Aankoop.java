package be.kdg.Mandje;

public class Aankoop {
    private Artikel artikel;
    private int aantal;

    public Aankoop(Artikel artikel, int aantal) {
        this.artikel = artikel;
        this.aantal = aantal;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }


}
