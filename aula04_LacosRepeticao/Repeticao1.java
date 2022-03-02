package aula04_LacosRepeticao;

import java.util.Scanner;

public class Repeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, media, somaMedia=0, mediaGeral;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=1; x<=5;x++)
		{
			System.out.println("\n Entre com a primeira nota do aluno " + x + ": ");
			n1 = leia.nextFloat();
			while(n1<0 || n1>10)
			{
				System.out.println("\n A nota deve estar entre 0 e 10.\n Entre com a primeira nota do aluno " + x + ": ");
				n1 = leia.nextFloat();
			}
			System.out.println("\n Entre com a segunda nota do aluno " + x + ": ");
			n2 = leia.nextFloat();
			while(n2<0 || n2>10)
			{
				System.out.println("\n A nota deve estar entre 0 e 10.\n Entre com a primeira nota do aluno " + x + ": ");
				n2 = leia.nextFloat();
			}
			System.out.println("\n Entre com a terceira nota do aluno " + x + ": ");
			n3 = leia.nextFloat();
			while(n3<0 || n3>10)
			
			{
				System.out.println("\n A nota deve estar entre 0 e 10.\n Entre com a primeira nota do aluno " + x + ": ");
				n3 = leia.nextFloat();
			}
			
			media= (n1+n2+n3)/3;
			somaMedia += media;
		}
		
		mediaGeral = somaMedia / 5;
		System.out.println("\n A média geral é: "+mediaGeral);
	}

}
