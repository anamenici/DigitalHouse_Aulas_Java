package aula03_LacoDecisao_IfElseSwitchCase;

import java.util.Scanner;

public class Operadores_Decisao {
	public static void main(String[] args) {
				
		float n1, n2, resultado=0;
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = ler.nextFloat();
		
		System.out.println("\nEntre com o segundo número: ");
		n2 = ler.nextFloat();
		
		System.out.println("\n\t\tCalculadora");
		System.out.println("\n 1 - Soma");
		System.out.println("\n 2 - Diferença");
		System.out.println("\n 3 - Multiplicação");
		System.out.println("\n 4 - Divisão");
		System.out.println("\nEntre com sua opção: ");
		op = ler.nextInt();
		
		switch(op)
		{
		case 1:
			resultado = n1 + n2;
			break;
		case 2:
			resultado = n1 - n2;
			break;
		case 3:
			resultado = n1 * n2;
			break;
		case 4:
			if(n2==0)
			{
				System.out.println("\nNão é possível fazer a divisão por zero");
			}
			else 
			{
			resultado = n1 / n2;
			}
			break;
		default: 
			System.out.println("\n Opção Inválida!");
		}
		System.out.println("\n Resultado: " + resultado);
		
	}
}
