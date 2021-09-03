import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
		Double vender;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do produto: ");
		Double valor = sc.nextDouble();
		
		if(valor < 20.00) {
			vender = (Double) (valor *1.45);
			System.out.println("O produto deve ser vendido por: "+vender);
		}
		
		else {
			vender = (Double) (valor*1.30);
			System.out.println("O produto deve ser vendido por: "+vender);
		}
	}

}
