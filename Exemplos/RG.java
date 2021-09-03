
import java.time.LocalDate;
public class RG {
	private String nome;
	private LocalDate dataEmissao;
	private String numero;
	
	public void Rg() {
		this.nome = nome;
	}
	public void Rg(LocalDate dataEmissao, String numero) {
		this.dataEmissao = dataEmissao;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
