import java.util.Scanner;
public class Exe01 {

	public static void main(String[] args) {
		
		Integer valor = 0;
		Integer contn = 0;
		Integer i = 0;
		Integer media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um valor: ");
			valor = sc.nextInt();
			
			if(valor > 0) {
				contn = contn + valor;
				i = i+1;
				media = contn/i;
			}
		}
		
		while(valor > 0);
			System.out.println("foram digitados "+i+" valores");
			System.out.println("A média é: "+media);
	}

}
