package aula08_POO;

public class TesteAutomovel {

	public static void main(String[] args) {
		
		Automovel auto = new Automovel("Rejane Santos","Celta","RSA2J34",2015);
		auto.imprimirInfo();
		System.out.println("\n***************************************");
		System.out.println("\n******Transferência de Proprietário*******");
		auto.setNomeProprietario("\n***********Emily Pellini*************");
		System.out.println("\n***************************************");
		auto.imprimirInfo();
		
	}

}
