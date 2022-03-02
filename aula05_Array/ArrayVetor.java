package aula05_Array;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		float[] media = new float[5];
		float n1, n2, n3, somaMedia=0, mediaGeral;
		int x, aprovados=0, exame=0, reprovados=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<5; x++)
		{
			System.out.println("\nEntre com a primeira nota: ");
			n1=leia.nextFloat();
			while(n1<0 || n1>10)
			{
				System.out.println("\nIntervalo de notas não permitido... Entre com a primeira nota: ");
				n1=leia.nextFloat();
			}
			System.out.println("\nEntre com a segunda nota: ");
			n2=leia.nextFloat();
			while(n2<0 || n2>10)
			{
				System.out.println("\nIntervalo de notas não permitido... Entre com a primeira nota: ");
				n2=leia.nextFloat();
			}
			
			System.out.println("\nEntre com a terceira nota: ");
			n3=leia.nextFloat();
			while(n3<0 || n3>10)
			{
				System.out.println("\nIntervalo de notas não permitido... Entre com a primeira nota: ");
				n3=leia.nextFloat();
			}
						
			media[x] = (n1+n2+n3)/3;
			
			System.out.println("\nMédia: "+ media[x]);
			if(media[x]>=7 && media[x]<=10)
			{
				System.out.println("\nAluno Aprovado!");
				aprovados++;
			}
			else if(media[x]>=5 && media[x]<7)
			{
				System.out.println("\nAluno de Exame!");
				exame++;
			}
			else if(media[x]<5 && media[x]>=0)
			{
				System.out.println("\nAluno Reprovado!");
				reprovados++;
			}
	
			somaMedia += media[x];
			
		}
		mediaGeral = somaMedia/x;
		
		System.out.println("\nA média geral é "+mediaGeral);
		System.out.println("\nTotal de Alunos Aprovados: "+aprovados);
		System.out.println("\nTotal de Alunos de Exame: "+exame);
		System.out.println("\nTotal de Alunos Reprovados: "+reprovados);
		
	}

}
