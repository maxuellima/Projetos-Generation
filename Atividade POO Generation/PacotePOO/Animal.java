package PacotePOO;

public class Animal {
	
	//Criando os atributos da minha classe m�e
	
	private String nome;
	private int idade;
	private String som;
	
	//Criando os Construtores
	
	public Animal(String nome, int idade, String som)
	{
		/*this indica que quem est� ao lado dele � o atributo 
		e o nome do outro lado � o par�metro que ser� passado. This � o referencial da pr�pria classe.*/ 
		
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		
	}

	//Criando os m�todos - Criando os gets e sets
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	
	//criar meus pr�prios m�todos

	public void imprimir()
	{
		System.out.println("\n***********************************");
	}
	
	
	
	

}
