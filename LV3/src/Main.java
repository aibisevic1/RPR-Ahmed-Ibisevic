import Klase.*;
import Interfejs.IZdravlje;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Voce jabuka = new Voce("Jabuka", "Malus domestica", "BiH", 0.3, 12.0, 2.4, 5.0, 0.2); // Ukupno 19.9 kalorija
        Povrce mrkva = new Povrce("Mrkva", "Daucus carota", "Hrvatska", 0.9, 9.6, 2.8, 3.0, 0.2); // Ukupno 16.5 kalorija
        Meso piletina = new Meso("Pileći", "piletina", "BiH", 32.0, 2.0, 0.0, 1.0, 1.2); // Osnova 25.2 kalorija * 1.2 = 30.24 kalorija
        Prodavac prodavac = new Prodavac("Faris", "Suljic", 2, "LIC-070501");

        List<Artikal> artikli = new ArrayList<>();
        artikli.add(jabuka);
        artikli.add(mrkva);
        artikli.add(piletina);

        for (Artikal artikal:artikli) {
            System.out.println(artikal.getNaziv() + " ima ukupno kalorija: " + artikal.dajBrojKalorija());
        }

        List<IZdravlje> objekti = new ArrayList<>();
        objekti.add(jabuka);
        objekti.add(mrkva);
        objekti.add(piletina);
        objekti.add(prodavac);

        double koeficijent = 0.8;

        for (IZdravlje subjekat : objekti) {
            boolean jeZdrav = subjekat.zdravlje(koeficijent);
            System.out.println(subjekat.getClass().getSimpleName() + " - Zdrav: " + jeZdrav);
        }
        System.out.println(prodavac.getImeIPrezime());
        System.out.println(prodavac.getIdLicence());
    }
}
