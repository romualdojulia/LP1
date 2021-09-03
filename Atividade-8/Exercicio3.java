package atv8;

import java.util.ArrayList;

public class Exercicio3 {

	public static void main(String[] args) {

		ArrayList<String> lista = null;

		try {
			System.out.println("Imprimindo a lista:" + lista.size());
		}
		catch(NullPointerException exception) {
			System.out.println("A lista possui um valor nulo");
			System.out.println("Adicionando nomes à lista...");
			lista = new ArrayList<>();
			lista.add("Nicolas");
			lista.add("Guilherme");
			lista.add("Nathalia");

		}
		finally {
			System.out.println("Nomes adicionados à lista:\n" + lista);
		}

	}
}
