package aula10_Polimorfismo;

public class Celular extends Telefone {
	
	public Celular() {
		super("Telefone Celular");
	}
	
	@Override
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("\nShalamar...shalamar");
			break;
		case 2:
			System.out.println("\nTananinana...Tananinana...");
			break;
		default:
			System.out.println("\nTa...tanana...tanana");
		}
	}
	
	@Override
	public void disca(String numero)
	{
		System.out.println("\nO número: "+numero+" é um celular...");
	}
	
	
}

	
	
	

