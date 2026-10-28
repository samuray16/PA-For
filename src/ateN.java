import java.util.Scanner;

public class ateN {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n;
		int i;
		System.out.println("Digite qualaquer numero para o contador: ");
		n = ler.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println(i);
		}

	}

}
