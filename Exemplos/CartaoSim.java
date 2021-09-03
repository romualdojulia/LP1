
public class CartaoSim {

	private String operadora;
	private String tamanho;
	private Integer numero;
	
	public CartaoSim() {
		this.operadora = "";
		this.tamanho = "";
		this.numero = 0;
	}
	
	public CartaoSim(String op, String tam, Integer num) {
		this.operadora = op;
		this.tamanho = tam;
		this.numero = num;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
