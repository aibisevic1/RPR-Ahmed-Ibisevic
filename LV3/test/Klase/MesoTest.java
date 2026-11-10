package Klase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MesoTest {

    @Test
    void getVrsta() {
        Meso m = new Meso("Pileći", "piletina", "BiH", 32.0, 2.0, 0.0, 1.0, 1.2);
        assertEquals("piletina",m.getVrsta());
    }

    @Test
    void dajBrojKalorija() {
        Meso m = new Meso("Pileći", "piletina", "BiH", 32.0, 2.0, 0.0, 1.0, 1.2);
        assertEquals(43.440000000000005,m.dajBrojKalorija());
    }

    @Test
    void zdravlje() {
        Meso m = new Meso("Pileći", "piletina", "BiH", 32.0, 2.0, 0.0, 1.0, 1.2);
        assertTrue(m.zdravlje(1.0));
    }
}