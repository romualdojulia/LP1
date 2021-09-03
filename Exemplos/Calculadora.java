
public class Calculadora {
	
	public static Integer multiplicar(Integer v1, Integer v2) {
		return v1*v2;
	}
	public static Double multiplicar(Double v1, Double v2) {
		return v1*v2;
	}
	public static Integer cubo(Integer v1) {
		return v1*v1*v1;
	}
	public static void parimpar(Integer v1) {
		 if(v1 == 0)
			System.out.println("Zero");
		 else if(v1 % 2 == 0)
			System.out.println(+v1+" é um número par");
		else
			System.out.println(+v1+" é um número ímpar");
		}
	}