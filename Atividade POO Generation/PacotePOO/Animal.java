package PacotePOO;

public class Animal {
	
	//Criando os atributos da minha classe mãe
	
	private String nome;
	private int idade;
	private String som;
	
	//Criando os Construtores
	
	public Animal(String nome, int idade, String som)
	{
		/*this indica que quem está ao lado dele é o atributo 
		e o nome do outro lado é o parâmetro que será passado. This é o referencial da própria classe.*/ 
		
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		
	}

	//Criando os métodos - Criando os gets e sets
	
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
	
	
	//criar meus próprios métodos

	public void imprimir()
	{
		System.out.println("\n***********************************");
	}
	
	
	
	

}
