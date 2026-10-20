import java.util.Scanner;
import java.util.*;




public class Main {
    
    public static Double Plus(double broj1,double broj2){
        return broj1+broj2;
    }
    public static Double Podijeljeno(double broj1,double broj2) throws Exception{
        if(broj2==0){
            throw new Exception("Nije dozvoljeno dijeliti s nulom!");
            
        }
        return broj1/broj2;
        
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.printf("Unesi operaciju ('plus' za sabiranje, 'podijeljeno' za dijeljenje");
        String s1=s.nextLine();
        List<Double> brojevi = new ArrayList<Double>();
        double zbir=0, dijeljenje=1;
        while(true){
            double x=s.nextDouble();
            if(x==-400){
                break;
            }
            brojevi.add(x); 
        }
        try{
            Double rezultat=brojevi.get(0);
            for(int i=1;i<brojevi.size();i++){
                if(s1.equals("plus")){
                    rezultat=Plus(rezultat,brojevi.get(i));
                }
                if(s1.equals("podijeljeno")){
                    rezultat= Podijeljeno(rezultat,brojevi.get(i));
                }
            }
            double zaokruzeni_rez=(Math.round(rezultat*100))/100;
            System.out.println("Konacni rezultat je: "+zaokruzeni_rez);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
