package aula05_Array;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		int[][] numeros = new int[2][3];
		int linha, coluna, quantPar=0, somaImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0; linha<2; linha++)
		{
			for(coluna=0; coluna<3; coluna++)
			{
				System.out.println("\nDigite um número: ");
				numeros[linha][coluna] = leia.nextInt();
				
				if(numeros[linha][coluna] % 2 == 0)
				{
				quantPar++;
				}
				else
				{
				somaImpar += numeros[linha][coluna];
				}
				
												
			}
		}
		
		
	}

}
