package atv5;

import java.time.LocalDate;

public class TesteAtv {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.of(2000, 02, 5);
		Pessoa pessoa1 = new Pessoa("batata", data);
		System.out.println(pessoa1.toString());
		
		Aluno a1 = new Aluno("Brocolis", data, "SP985262", "brocolisazul@gmail.com");
		System.out.println(a1.toString());
		
		Bolsista b1 = new Bolsista("Beterraba", data, "Sp4582630", "beterrabalaranja@gmail.com", 108.99);
		System.out.println(b1.toString());

		Atleta at1 = new Atleta("Pimenta", data,"Sp4506895", "Pimentavolei@gmail.com", "Vôlei");
		System.out.println(at1.toString());
	}

}
