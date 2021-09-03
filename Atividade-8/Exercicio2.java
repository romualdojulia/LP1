package atv8;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {

		try {
			int a = 0;
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Digite um valor: ");
			a = sc.nextInt();
		}
		
		catch(InputMismatchException exception) {
			System.out.println("Digite um valor válido");
			
		}
	}

}
