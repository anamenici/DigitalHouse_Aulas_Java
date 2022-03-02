package aula09_Heranca;

public class TesteOperario {

	public static void main(String[] args) {
		
		Operario op = new Operario("Paula", "Rua 10, 101", "33344455578", 1199775544, 26, 5521.00, 521.12);
		op.imprimirInfo();
		op.calcularProducao();

		
	}

}
