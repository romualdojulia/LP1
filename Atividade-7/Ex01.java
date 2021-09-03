package atv7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<=4; i++) {
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();
			lista.add(nome);
		}
		
		System.out.println("\nOs nomes cadastrados em ordem inversa:\n");
		
		for(int i=4; i>=0; i--) {
			System.out.println(lista.get(i));
		}
	}

}
