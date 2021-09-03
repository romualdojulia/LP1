
public class Motor {

	private String tipo;
	private Double tamanho;
	
	public Motor() {
		this.tipo ="";
		this.tamanho = 0.0;
	}
	
	public Motor(String tp, Double tam) {
		this.tipo = tp;
		this.tamanho = tam;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}
	
}
