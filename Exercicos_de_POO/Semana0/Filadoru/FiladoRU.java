import java.util.Locale;
import java.util.Scanner;

public class FiladoRU {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;
        n = input.nextInt();


        int vet[] = new int[n];
        int contA = 0;
        for(int i = 0 ; i < n ; i++){
             vet[i] = input.nextInt();
                if(vet[i] % 2 == 0){
                    contA++;
                }
        }
        input.close();


        int A[] = new int[contA];
        int B[] = new int[n - contA];

        System.out.printf("[ ");
    
        for(int i = 0 , j = 0 ; i < n ; i++){
            if(vet[i] % 2 != 0){
                B[j] = vet[i];
                System.out.printf(B[j] +" ");
                j++;
            }
        }
        System.out.printf("]");

        System.out.println();

        System.out.printf("[ ");

        for(int i = 0 , j = 0 ; i < n ; i++){
            if(vet[i] % 2 == 0){
                A[j] = vet[i];
                System.out.printf(A[j] + " ");
                j++;
            }
        }

        System.out.printf("]");



    }
}