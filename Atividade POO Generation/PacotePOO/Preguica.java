package PacotePOO;

public class Preguica extends Animal{
	
	//Declarar os atributos do seu objeto/subclasse pregui�a
	
	private String escalar;
	
	//Criar os construtores
	
	public Preguica(String nome, int idade, String som, String escalar)
	{
		super(nome, idade, som);
		this.escalar = escalar;
	}
	
	//Declarar os m�todos get e set

	public String getEscalar() {
		return escalar;
	}

	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}
	
	//Criar meus pr�prios m�todos
	
	public void imprimirPreguica()
	{
		System.out.println("\nNome da Pregui�a: " + getNome()+ "\nSua idade: "+ getIdade()+ 
				"\nO som que emite: " + getSom() + "\nSua habilidade principal: " + escalar);
	}
	
	
	
	
	
	
	
	

}
