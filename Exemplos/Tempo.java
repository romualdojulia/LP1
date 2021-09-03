
public class Tempo {

	private Integer hora;
	private Integer minutos;
	private Integer segundos;
	
	public Tempo() {
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	public Tempo(Integer hr, Integer min, Integer seg) {
		this.hora = hr;
		this.minutos = min;
		this.segundos = seg;
	}
	public Integer getHora() {
		return hora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public Integer getMinutos() {
		return minutos;
	}
	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}
	public Integer getSegundos() {
		return segundos;
	}
	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}
	
	public void Imprimir() {
		System.out.println(this.hora+":"+this.minutos+":"+this.segundos);
	}
	
	public Integer horasemsegundos() {
		if(this.hora>0)
			return this.hora*3600;
		else
			return 0;
	}
	public Integer minutosemsegundos() {
		if(this.minutos > 0)
			return this.minutos*60;
		else
			return 0;
	}
}
