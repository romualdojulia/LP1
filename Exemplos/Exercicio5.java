import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		int idade = sc.nextInt();
	
		if(idade>=16)
			System.out.println("Pode voltar");
		else
			System.out.println("Não pode votar");

	}

}
