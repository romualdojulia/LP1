package atv6;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {

		Mamifero ma = new Mamifero("Azul", LocalDate.of(2014, 03, 12));
		Cachorro ca = new Cachorro("Max", LocalDate.of(2014, 03, 12), "amarelo");		
		Gato ga = new Gato("Garfield", LocalDate.of(2014, 03, 12), "Laranja");
		
		System.out.println(ma.toString()
                +"\n"+ca.toString()
                +"\nIdade: "+ca.idade()
                +"\tEspecie: "+ca.especie()
                +"\tSom: "+ca.somAnimal()
                +"\n\n"+ga.toString()
                +"\nIdade: "+ga.idade()
                +"\tEspecie: "+ga.especie()
                +"\tSom: "+ga.somAnimal());
	}

}
