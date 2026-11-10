package Klase;

import Interfejs.IZdravlje;

public abstract class Artikal implements IZdravlje {

    private String naziv;
    private String zemljaPorijekla;
    private double proteini;
    private double ugljikohidrati;
    private double vlakna;
    private double vitamini;
    private double kolicinaMasti;

    public Artikal(String naziv, String zemljaPorijekla, double proteini, double ugljikohidrati, double vlakna, double vitamini, double kolicinaMasti) {
        this.naziv = naziv;
        this.zemljaPorijekla = zemljaPorijekla;
        this.proteini = proteini;
        this.ugljikohidrati = ugljikohidrati;
        this.vlakna = vlakna;
        this.vitamini = vitamini;
        this.kolicinaMasti = kolicinaMasti;
    }

    public double dajBrojKalorija() {
        return proteini + ugljikohidrati + vlakna + vitamini + kolicinaMasti;
    }

    public String getNaziv() { return naziv; }
    public String getZemljaPorijekla() { return zemljaPorijekla; }

    @Override
    public abstract boolean zdravlje(double koeficijentZdravlja);
}
