import java.util.Scanner;

public class calculopares {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int p = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int n = ler.nextInt();
            
           
            if (n % 2 == 0) {
                p++; 
                System.out.println("O número " + n + " é par.");
            } else {
                System.out.println("O número " + n + " é ímpar.");
            }
        }
        
        System.out.println("\nTotal de números pares digitados: " + p);
        
    }
}