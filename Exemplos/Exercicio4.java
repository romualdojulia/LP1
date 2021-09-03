import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int a = sc.nextInt();
		
		if(a % 2 == 0)
			System.out.println("O número é PAR!");
		else
			System.out.println("O número é ÍMPAR");
	}

}
