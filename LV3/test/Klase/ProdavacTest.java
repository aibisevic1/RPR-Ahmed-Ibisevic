package Klase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdavacTest {

    @Test
    void getImeIPrezime() {
        Prodavac prod= new Prodavac("Arif","Begic",69,"01");
        String ocekivani_rez="Arif Begic";
        assertEquals(ocekivani_rez,prod.getImeIPrezime());
    }

    @org.junit.jupiter.api.Test
    void zdravlje() {
        Prodavac prod= new Prodavac("Arif","Begic",69,"01");
        assertTrue(prod.zdravlje(1.0));
        Prodavac prod2= new Prodavac("Arif", "Begic",69,"2131231");
        assertFalse(prod2.zdravlje(1.0));
    }

    @org.junit.jupiter.api.Test
    void getIdLicence() {
        Prodavac prod= new Prodavac("Arif","Begic",69,"01");
        assertEquals("01",prod.getIdLicence());
    }
}