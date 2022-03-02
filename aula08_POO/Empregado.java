package aula08_POO;

import java.text.NumberFormat;

public class Empregado {
	private String nome;
	private double salario;
	
	public Empregado(String n, double s)
	{
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) //criação de método
	{
		salario *= 1 + percentual / 100;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();//moeda do país
		//nf é uma variável, se fosse objeto teria que ter "new"
		nf.setMinimumFractionDigits(2);//qtde de casa depois da vírgula
		String formatoMoeda = nf.format(salario);//formatação monetária
		return formatoMoeda;
	}
	
	public void imprimir()
	{
		System.out.println(nome + "\t\t" + "Salário: " + this.formatarMoeda());
	}
}
