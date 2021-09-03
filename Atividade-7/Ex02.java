package atv7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		int del;
		Scanner sc = new Scanner(System.in);
		
		nomes.add("Nicolas");
		nomes.add("Guilherme");
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Natalia");
		
		System.out.println("Nomes cadastrados:");
		  for(String str: nomes)	{
		      System.out.println(str);
		    }
		
		System.out.println("\n Você deseja excluir algum nome: [S/N]");
		String resp = sc.nextLine();
		
		if (resp.equals("s") || resp.equals("S")) {
			System.out.println("Qual a posição do nome que você deseja excluir, incie a contagem do 0:");
			del = sc.nextInt();
			
			nomes.remove(del);
			
			System.out.println("Lista atualizada:");
			 for(String str: nomes)	{
			      System.out.println(str);
			    }
		}
		
		else {
			System.out.println("A lista permanece igual: ");
			for(String str: nomes)	{
			      System.out.println(str);
			    }
		}
	}
}
