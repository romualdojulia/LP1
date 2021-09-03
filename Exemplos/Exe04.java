import java.util.Scanner;
public class Exe04 {

	public static void main(String[] args) {
		
		Integer i = 0;
		Integer n = 0;
		Integer maior = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(i<10) {
			System.out.println("Digite um número: ");
			n = sc.nextInt();
			i++;
			
			if(n>maior)
				maior = n;
		}

		System.out.println("O maior valor digitado é: "+maior);

	}
}
