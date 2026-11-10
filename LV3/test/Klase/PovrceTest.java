package Klase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PovrceTest {

    @Test
    void getLatinskiNaziv() {
        Povrce p= new Povrce("Mrkva", "Daucus carota", "Hrvatska", 0.9, 9.6, 2.8, 3.0, 0.2);
        assertEquals("Daucus carota",p.getLatinskiNaziv());
    }

    @Test
    void zdravlje() {
        Povrce p=new Povrce("Mrkva", "Daucus carota", "Hrvatska", 0.9, 9.6, 2.8, 3.0, 0.2);
        assertFalse(p.zdravlje(1.0));
    }
}