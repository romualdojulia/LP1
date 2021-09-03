
public class Exercicio02 {

	public static Integer min3(Integer a, Integer b, Integer c) {
		
		if(a<b) {
			if (a<c)
				return a;
			else
				return c;
		}
		else {
			if(b<c) 
				return b;
			else return c;
		}
	}
	
	public static Double min3(Double a, Double b, Double c) {
		if(a<b) {
			if (a<c)
				return a;
			else
				return c;
		}
		else {
			if(b<c) 
				return b;
			else return c;
		}
	}
}
