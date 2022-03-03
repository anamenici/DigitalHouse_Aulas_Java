package aula10_Polimorfismo;

public abstract class Telefone {
	
	private String tipo;
	
	abstract public void disca(String numero); //apenas modelo de implementação: classe abstrata não se implementa
	abstract public void toca(int numToques);  //outro exemplo de método abstrato
			
	public Telefone(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
