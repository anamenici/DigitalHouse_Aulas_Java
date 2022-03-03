package aula10_Polimorfismo;

public class Fixo extends Telefone {

	public Fixo()
	{
		super("Telefone Fixo");
	}
	
	@Override
	public void toca(int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("\nTrimmm... Trimmmmm");
		}
	}
	
	@Override
	public void disca(String numero)
	{
		System.out.println("\nDiscando: "+numero);
	}
	
}
