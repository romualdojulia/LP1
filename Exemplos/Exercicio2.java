import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		
		double total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas maçãs você quer comprar?");
		int macas = sc.nextInt();
		
		if(macas < 12) {
			total = (double) (macas *0.30);
			System.out.println("O valor das maçãs é: "+total);
		}
		
		else if(macas >=12) {
			total = (double) (macas *0.25);
			System.out.println("O valor das macãs é: "+total);
		}

	}

}
