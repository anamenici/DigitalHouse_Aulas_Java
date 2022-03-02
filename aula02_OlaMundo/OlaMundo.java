package aula02_OlaMundo;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		String nome; //criando uma variável do tipo String
		int idade=26;//acrescentar x e y depois
		double altura, nota1, nota2, nota3, media;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Olá, Mundo!!!");//saída de dados, ou seja, impressão no console
			
			System.out.println("\nEntre com o seu nome: ");
			nome = leia.nextLine(); 
			
			System.out.println("\nEntre com sua altura: ");
			altura = leia.nextFloat();		
			
			System.out.println("\nEntre com a primeira nota: ");
			nota1 = leia.nextFloat();
			
			System.out.println("\nEntre com a segunda nota: ");
			nota2 = leia.nextFloat();
			
			System.out.println("\nEntre com a terceira nota: ");
			nota3 = leia.nextFloat();
		}
		
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
		
		System.out.printf("Meu nome é %s, eu tenho %d anos(s) e a minha altura é %1.2f",nome, idade, altura);
		
		System.out.printf("\nMédia aritmética: %2.2f",media);
		
		//nota1 = Math.sqrt(nota2);
		//nota2 = Math.pow(nota3, 3);
		
		/*System.out.println("\nEntre com o valor de X: ");
		x = leia.nextInt();
		
		System.out.println("\nEntre com o valor de Y: ");
		y = leia.nextInt();
		
		x = x % y;
		*/

	}

}
