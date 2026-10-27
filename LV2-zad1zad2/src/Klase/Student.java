package Klase;

import Izuzeci.DijeljenjeSNulomException;
import Izuzeci.PremladStudentException;
import Izuzeci.StudentBuducnostException;
import Klase.Odsjek;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Student
{
    private String ime, prezime, brojIndeksa;
    private Odsjek odsjek;
    private LocalDate datumRodjenja;
    private Integer godinaStudija;
    private List<Integer> ocjene;

    public Student(String ime, String prezime, LocalDate datumRodjenja, String brojIndeksa, Odsjek odsjek, Integer godinaStudija) throws Exception
    {
        setIme(ime);
        setPrezime(prezime);
        setDatumRodjenja(datumRodjenja);
        setBrojIndeksa(brojIndeksa);
        setOdsjek(odsjek);
        setGodinaStudija(godinaStudija);
        setOcjene(new ArrayList<Integer>());
    }


    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public Odsjek getOdsjek() {
        return odsjek;
    }

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public Integer getGodinaStudija() {
        return godinaStudija;
    }

    public List<Integer> getOcjene() {
        return ocjene;
    }
    public void setDatumRodjenja(LocalDate datumRodjenja) throws StudentBuducnostException, PremladStudentException {
        LocalDate today = LocalDate.now();
        if (datumRodjenja.isEqual(today) || datumRodjenja.isAfter(today))
            throw new StudentBuducnostException("Datum rođenja ne može biti u budućnosti!");

        else if (today.getYear() - datumRodjenja.getYear() < 16)
            throw new PremladStudentException("Student ne može biti mlađi od 16 godina!");

        this.datumRodjenja = datumRodjenja;
    }



    public void setGodinaStudija(Integer godinaStudija) {
        if (this.odsjek != Odsjek.RS && godinaStudija > 0 && godinaStudija < 6)
            this.godinaStudija = godinaStudija;
        else if (this.odsjek == Odsjek.RS && godinaStudija > 0 && godinaStudija <= 2)
            this.godinaStudija = godinaStudija;
    }


    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public void setOdsjek(Odsjek odsjek) {
        this.odsjek = odsjek;
    }

    public void setOcjene(List<Integer> ocjene) {
        this.ocjene = ocjene;
    }
    public Double Prosjek() throws DijeljenjeSNulomException {
        Double prosjek = 0.0;
        for (Integer ocjena : ocjene)
            prosjek += ocjena;
        if(prosjek!=0) return prosjek/ocjene.size();
        else throw new DijeljenjeSNulomException("Zabranjeno dijeljenje s nulom");
    }


    public String toString() throws DijeljenjeSNulomException{
        try {
            return "Student: " + ime + " " + prezime + ", broj indeksa: " + brojIndeksa + ", prosjek: " + Prosjek();
        }catch(DijeljenjeSNulomException e){
            return " ";
        }
    }



}
