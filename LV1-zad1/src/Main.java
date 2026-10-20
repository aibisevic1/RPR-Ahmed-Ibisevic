import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    static boolean DaLiJeProst(int n){
        boolean prost = true;
        if (n == 2) return true;
        for(int z=2;z<n;z++){
            if(n%z==0) prost=false;
        }
        return prost;

    }


    public static void main(String[] args) {

        int n=501;
        Scanner in = new Scanner(System.in);
        for(;n>=500;){
            System.out.printf("Unesite broj n: ");
            n=in.nextInt();
        }
        for(int k=2;k<=2*n;k++){
            if(DaLiJeProst(k)) System.out.println(""+k);
        }
    }
}