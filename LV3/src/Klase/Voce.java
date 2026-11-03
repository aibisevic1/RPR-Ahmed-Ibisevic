package Klase;

public class Voce extends Artikal {
    private String latinskiNaziv;

    public Voce(String naziv, String latinskiNaziv, String zemljaPorijekla,
                double proteini, double ugljikohidrati, double vlakna, double vitamini, double kolicinaMasti) {
        super(naziv, zemljaPorijekla, proteini, ugljikohidrati, vlakna, vitamini, kolicinaMasti);
        this.latinskiNaziv = latinskiNaziv;
    }

    public String getLatinskiNaziv() {
        return latinskiNaziv;
    }

    @Override
    public boolean zdravlje(double koeficijentZdravlja) {
        return dajBrojKalorija() < 50 && koeficijentZdravlja > 0.75;
    }
}