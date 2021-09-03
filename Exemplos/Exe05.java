import java.util.Scanner;
public class Exe05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		for(int tab = 1; tab<11; tab++){
			int r = num*tab;
			System.out.println(+num+"X"+tab+"=" +r);
		}
	}

}
