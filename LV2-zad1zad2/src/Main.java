import Izuzeci.PremladStudentException;
import Izuzeci.StudentBuducnostException;
import Klase.Odsjek;
import Klase.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean uspjesanUnos = false;
        Student student = null;
        while (!uspjesanUnos) {
            try {
                System.out.printf("Datum rođenja (dd/mm/yyyy):");
                String datumString = scanner.nextLine();
                int godina = Integer.valueOf(datumString.substring(6));
                int mjesec = Integer.valueOf(datumString.substring(3, 5));
                int dan = Integer.valueOf(datumString.substring(0, 2));
                LocalDate datumDate = LocalDate.of(godina, mjesec, dan);
                student = new Student("Ime", "Prezime", datumDate, "12345", Odsjek.RI, 2);
                uspjesanUnos = true;
            } catch (PremladStudentException e) {
                System.out.println(e.getMessage());
                return;
            } catch (StudentBuducnostException e) {
                System.out.println(e.getMessage());
                System.out.println("Molimo ponovite unos datuma rođenja!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("Unesite ocjene studenta: (x,y,...):");
        String unosOcjena= scanner.nextLine();
        String[] ocjene_niz_string=unosOcjena.split(",");
        List<Integer> listaOcjena= new ArrayList<>();
        for(String ocjenaStr: ocjene_niz_string){
            int ocjenaBroj;
            listaOcjena.add(Integer.parseInt(ocjenaStr.trim()));
        }
        student.setOcjene(listaOcjena);

        System.out.println("Unos studenta uspješan! " + student);
    }
}
