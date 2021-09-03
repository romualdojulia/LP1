package atv7;

import java.util.Random;
import java.util.ArrayList;
public class Ex03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> valores = new ArrayList<>();
		valores = criaVetor(10);
		int maior = 0;

		System.out.println("Os valores armazenados são: "+valores);
		
		for(int i=0; i<valores.size(); i++) {
			if(valores.get(i)> (maior)) {
				maior = valores.get(i);
			}
		}
		System.out.println("O maior valor da lista é: "+maior);
	}
		
		public static ArrayList<Integer> criaVetor(int n) {
			ArrayList<Integer> valores = new ArrayList<>();
		    Random aleatorio = new Random();
				
			for(int i = 0; i < n; i++) {
		      valores.add(aleatorio.nextInt(101));
		    }
				
		    return valores;
			
	}

}
