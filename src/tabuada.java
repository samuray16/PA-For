import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n;
		int i;
		System.out.println("Digite um numero de 1 a 10: ");
		n = ler.nextInt();
		for(i=1;i<=10;i++) {
			System.out.println(n*i);
		}

	}

}
