package Klase;

import Interfejs.IZdravlje;

public class Prodavac implements IZdravlje {
    private String ime;
    private String prezime;
    private int brojStanda;
    private String idLicence;

    public Prodavac(String ime, String prezime, int brojStanda, String idLicence) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojStanda = brojStanda;
        this.idLicence = idLicence;
    }

    public String   getImeIPrezime() {
        return ime + " " + prezime;
    }

    @Override
    public boolean zdravlje(double koeficijentZdravlja) {
        return idLicence != null && idLicence.endsWith("01");
    }
    public String getIdLicence(){
        return idLicence;
    }
}