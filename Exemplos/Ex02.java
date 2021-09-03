import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		Integer a = sc.nextInt();
		System.out.println("Digite outro valor: ");
		Integer b = sc.nextInt();
		
		while(a!=b) {
			if(a<b) {
				System.out.println(+a);
				a = a+1;
			}
			else if(b<a) {
				System.out.println(+a);
				a = a-1;
			}
		}
		System.out.println(+a);
	}

}
