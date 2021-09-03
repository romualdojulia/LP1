
public class Carro2 {

	private String marca;
	private String modelo;
	private Motor motor;
	
	public Carro2() {
		this.marca = "";
		this.modelo = "";
		this.motor = new Motor();
	}
	
	public Carro2(String ma, String mod, Motor mot) {
		this.marca = ma;
		this.modelo = mod;
		this.motor = mot;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
}
