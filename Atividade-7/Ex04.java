package atv7;

import java.util.ArrayList;
public class Ex04 {

	public static void main(String[] args) {
		
		ArrayList<Integer> impares = new ArrayList<>();
		int somaimp = 0;
		
		for(int i = 0; i <=99;i++) {
			if(i%2 == 1) {
				impares.add(i);
			}
		}
		
		for(int i = 0; i< impares.size(); i++) {
			somaimp = somaimp + impares.get(i);
		}
		
		System.out.println("A soma dos números impares entre 0 e 100 é: "+somaimp);
	}

}
