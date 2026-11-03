package Klase;

public class Meso extends Artikal {
    private String vrsta; // piletina, puretina, teletina, janjetina

    public Meso(String naziv, String vrsta, String zemljaPorijekla,
                double proteini, double ugljikohidrati, double vlakna, double vitamini, double kolicinaMasti) {
        super(naziv, zemljaPorijekla, proteini, ugljikohidrati, vlakna, vitamini, kolicinaMasti);
        this.vrsta = vrsta;
    }

    public String getVrsta() {
        return vrsta;
    }

    @Override
    public double dajBrojKalorija() {
        return super.dajBrojKalorija() * 1.20;
    }

    @Override
    public boolean zdravlje(double koeficijentZdravlja) {
        return koeficijentZdravlja > 0.95;
    }
}