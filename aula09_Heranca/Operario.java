package aula09_Heranca;

public class Operario extends Pessoa {
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String cpf, int telefone, 
			int idade, double valorProducao, double comissao)
	{
		super(nome, endereco, cpf, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do operrio: " + getNome() + 
				"\nCPF: " + getCpf() + 
				"\nIdade: " + getIdade() + 
				"\nTelefone: " + getTelefone() + 
				"\nEndere�o: " + getEndereco() + 
				"\nValor monet�rio dos artigos produzidos: R$" + valorProducao +
				"\nComiss�o: R$" + comissao);
	}
	
	public void calcularProducao()
	{
		double valorTotal = valorProducao + (valorProducao * (comissao/100));
		System.out.println("\nO valor total a ser recebido pelo oper�rio:" + getNome() +
				"� de: R$" + valorTotal);
	}
}
