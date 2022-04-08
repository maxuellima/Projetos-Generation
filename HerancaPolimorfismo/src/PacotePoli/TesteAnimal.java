package PacotePoli;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		AnimalPoli animal = null;
		
		int x= 0;
		
		do
		{
			System.out.println("\nQual o tipo do seu animal?\n\n" +
		"1 - CACHORRO\n2- CAVALO\n3- PREGUIÇA\n");
			x = leia.nextInt();
			if(x==1)
			{
				animal = cachorro;
			System.out.println("\nQual o nome do seu doguinho? ");
			String nome = leia.nextLine();
			leia.nextLine();
			System.out.println("\nQuantos anos tem seu doguinho? ");
			int idade = leia.nextInt();
			leia.nextLine();
			System.out.println("Qual o som que seu doguinho emite?");
			String som = leia.nextLine();
			System.out.println();
			leia.nextLine();
			
			System.out.println("\n********************************");
			
			cachorro.nome(nome);
			cachorro.idade(idade);
			cachorro.som(som);
			}
			else if(x==2)
			{
				animal = cavalo;
				System.out.println("\nQual o nome do seu pangaré? ");
				leia.nextLine();
				String nome = leia.nextLine();
				System.out.println("\nQual a idade do seu cavalinho? ");
				int idade = leia.nextInt();
				System.out.println("\nQual o som que o seu equino emite? ");
				String som = leia.next();
				leia.nextLine();
				
				System.out.println("\n********************************");
				
				cavalo.nome(nome);
				cavalo.idade(idade);
				cavalo.som(som);
				
			}
			
			else if (x==3)
			{
				animal = preguica;
				System.out.println("\nQual o nome da sua preguiça? ");
				String nome = leia.next();
				leia.nextLine();
				System.out.println("\nQual a idade da sua preguiça?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nQual o som que emite a sua preguiça? ");
				leia.nextLine();
				
				System.out.println("\n********************************");
				
				preguica.nome(nome);
				preguica.idade(idade);
				preguica.som(nome);
			}
			else
			{
				System.out.println("\nOpção inválida!!!");
			}
		}
		
		while(x<=0 || x >=4);
		
		
		

	}

}
