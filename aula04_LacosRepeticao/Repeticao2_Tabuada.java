package aula04_LacosRepeticao;

import java.util.Scanner;

public class Repeticao2_Tabuada {

	public static void main(String[] args) {

		int tabuada, x=1, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com qual tabuada deseja montar: ");
		tabuada = leia.nextInt();
		
		do
		{
			resultado = x * tabuada;
			System.out.println("\n" +tabuada+ " X " +x+" = " +resultado);
			x++;
		}
		while(x<=10);
		

	}

}
