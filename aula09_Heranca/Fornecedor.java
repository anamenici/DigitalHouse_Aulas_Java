package aula09_Heranca;

public class Fornecedor extends Pessoa{
	
	private int estrelas;
	private float lucro;
	
	public Fornecedor(String nome, String endereco, String cpf, int telefone, int idade, int estrelas, float lucro) {
		super(nome, endereco, cpf, telefone, idade);
		this.estrelas = estrelas;
		this.lucro = lucro;
		
	}

	public int getEstrelas() {
		return estrelas;
	}

	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}

	public float getLucro() {
		return lucro;
	}

	public void setLucro(float lucro) {
		this.lucro = lucro;
	}
	
	public void imprimirInfo() {
		System.out.println("\nO fornecedor " + getNome()+ ", avaliado com " + getEstrelas()+" estrela(s), "
				+ "cobra " + getLucro() + "% de lucro.");
	}
	
}
