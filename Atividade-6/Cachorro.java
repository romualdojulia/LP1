package atv6;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements Animal{
	
	private String cor;
	
	public Cachorro() {
		super();
		this.cor = "";
	}
	
	public Cachorro(String nome, LocalDate nascimento, String cor) {
		super(nome, nascimento);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String especie() {
		return "Pastor Alemão";
	}

	public String somAnimal() {
		return "au-au";
	}

	public Integer idade() {
		return LocalDate.now().getYear() - this.getNascimento().getYear();
	}
	
	public String toString() {
		return super.toString()+"[cor=" + cor + "]";
	}
	
}
