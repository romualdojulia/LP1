import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
			
		String login = new String("");
		Integer senha = new Integer(0);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		login = sc.nextLine();
		System.out.println("Digite sua senha");
		senha = sc.nextInt();
		
		if (senha == 1234)
			System.out.println("ACESSO PERMITIDO");
		else
			System.out.println("ACESSO NEGADO");	
	}
}
