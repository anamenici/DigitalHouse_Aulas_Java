package aula03_LacoDecisao_IfElseSwitchCase;

import java.util.Scanner;

public class MediaNotas_If_Aprovado_Reprovado_Exame {
	
	public static void main(String[] args) {
						
			String nome; 
			double nota1, nota2, nota3, media;
			
			Scanner leia = new Scanner(System.in); 
				
			System.out.println("Olá, Mundo!!!");
				
			System.out.println("\nEntre com o seu nome: ");
			nome = leia.nextLine(); 	
				
			System.out.println("\nEntre com a primeira nota: ");
			nota1 = leia.nextFloat();
				
			System.out.println("\nEntre com a segunda nota: ");
			nota2 = leia.nextFloat();
				
			System.out.println("\nEntre com a terceira nota: ");
			nota3 = leia.nextFloat();
			
			media = (nota1+nota2+nota3) / 3;
			
			
			
			if(media>=7 && media <=10)
			{
				System.out.println("\nAluno Aprovado!");
			}
			else if(media>=5 && media<7)
			{
				System.out.println("\nAluno de Exame!"); 
			}
			else if(media>=0 && media<5)
			{
				System.out.println("\nAluno Reprovado!");
			}
			else
			{
				System.out.println("\nMédia Inválida!");
			}
			
			System.out.println("Meu nome é: "+nome);
			
			System.out.printf("\nMinha média aritmética é: %2.2f",media);
			
	}
}
