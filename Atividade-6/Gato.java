package atv6;

import java.time.LocalDate;

public class Gato extends Mamifero implements Animal{
	
	private String pelagem;
	
	public Gato() {
		super();
		this.pelagem = "";
	}
	
	public Gato(String nome, LocalDate nascimento, String pelagem) {
		super(nome, nascimento);
		this.pelagem = pelagem;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public String especie() {
		return "Persa";
	}

	public String somAnimal() {
		return "maiu-miau";
	}

	public Integer idade() {
		return LocalDate.now().getYear() - this.getNascimento().getYear();
	}

	public String toString() {
		return super.toString()+"[pelagem=" + pelagem + "]";
	}
	
	
}
