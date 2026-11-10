package Klase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoceTest {

    @Test
    void getLatinskiNaziv() {
        Voce v= new Voce("Jabuka", "Malus domestica", "BiH", 0.3, 12.0, 2.4, 5.0, 0.2);
        assertEquals("Malus domestica",v.getLatinskiNaziv());
    }

    @Test
    void zdravlje() {
        Voce v = new Voce("Jabuka", "Malus domestica", "BiH", 0.3, 12.0, 2.4, 5.0, 0.2);
        assertTrue(v.zdravlje(1.0));
    }
}