package Klase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtikalTest {


    private Artikal kreirajArtikal(String naziv, String zemlja, double p, double u, double vl, double vt, double m) {
        return new Artikal(naziv, zemlja, p, u, vl, vt, m) {
            @Override
            public boolean zdravlje(double koeficijentZdravlja) {
                return true;
            }
        };
    }


    @Test
    void dajBrojKalorija() {
        Artikal artikal = kreirajArtikal("Jabuka", "BiH", 10, 20, 5, 2, 3);
        assertEquals(40.0, artikal.dajBrojKalorija(), 0.001);
    }

    @Test
    void getNaziv() {
        Artikal artikal = kreirajArtikal("Jabuka", "BiH", 1, 1, 1, 1, 1);
        assertEquals("Jabuka", artikal.getNaziv());
    }

    @Test
    void getZemljaPorijekla() {
        Artikal artikal = kreirajArtikal("Jabuka", "BiH", 1, 1, 1, 1, 1);
        assertEquals("BiH", artikal.getZemljaPorijekla());
    }

    @Test
    void zdravlje() {

    }
}