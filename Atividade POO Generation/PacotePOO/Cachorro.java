package PacotePOO;

public class Cachorro extends Animal{
	
	//Atributos específicos da minha subclasse cachorro
	
	private String correr;
	
	public Cachorro(String nome,int idade, String som, String correr)
	{
		super(nome, idade, som);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	//Criando os métodos get e set do meu objeto cachorro
	
	public void imprimirDog()
	{
		System.out.println("\nNome do cachorro: " + getNome()+ "\nSua idade: " + getIdade() +
				"\nO som que emite: " + getSom() + "\nSua habilidade principal é: " + correr );
	}
	
}
