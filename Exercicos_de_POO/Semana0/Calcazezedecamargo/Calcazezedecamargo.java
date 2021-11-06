import java.util.Locale;
import java.util.Scanner;

public class Calcazezedecamargo{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        
        int n1;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        int menor = n1;
        int n2,n3,n4,n5;
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        n5 = input.nextInt();

        input.close();

        if(menor > n2){
            menor = n2;
        }

        if(menor > n3){
            menor = n3;
        }

        if(menor > n4){
            menor = n4;
        }

        if(menor > n5){
            menor = n5;
        }
 
        System.out.println(menor);

    }
}