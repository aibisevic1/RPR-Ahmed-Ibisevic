import java.util.Scanner;
import java.util.*;




public class Main {



    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.printf("Unesi operaciju ('plus' za sabiranje, 'podijeljeno' za dijeljenje");
        String s1=s.nextLine();
        double x=200;
        List<Double> brojevi = new ArrayList<Double>();
        double zbir=0, dijeljenje=1;
        int test=0;
        for(;x!=-400;){
            x=s.nextDouble();
            if(x==-400) break;
            brojevi.add(x);
            if(test==0){

            }
            if(s1.equals("plus")) zbir+=x;
            if(s1.equals("dijeljenje")) dijeljenje=x/dijeljenje;
        }

        if(s1.equals("plus")) System.out.printf("Zbir je: "+zbir);
        if(s1.equals("dijeljenje")) System.out.printf("Dijeljenje je: "+dijeljenje);


    }
}