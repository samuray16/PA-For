import java.util.Scanner;

public class soma10n {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int soma = 0;
		int i;
		int n;
		System.out.println("digite um numero: ");
		n = ler.nextInt();
		for(i=1;i<=10;i++) {
			soma =soma +n;
			
		}System.out.println(soma);

	}

}
