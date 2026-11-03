package Klase;

public class Povrce extends Artikal {
    private String latinskiNaziv;
    public Povrce(String naziv, String latinskiNaziv, String zemljaPorijekla,
                  double proteini, double ugljikohidrati, double vlakna, double vitamini, double kolicinaMasti) {
        super(naziv, zemljaPorijekla, proteini, ugljikohidrati, vlakna, vitamini, kolicinaMasti);
        this.latinskiNaziv = latinskiNaziv;
    }
    public String getLatinskiNaziv() {
        return latinskiNaziv;
    }
    @Override
    public boolean zdravlje(double koeficijentZdravlja) {
        return dajBrojKalorija() < 100 && (koeficijentZdravlja >= 0.5 && koeficijentZdravlja <= 0.7);
    }
}