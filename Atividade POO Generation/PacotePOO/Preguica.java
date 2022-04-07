package PacotePOO;

public class Preguica extends Animal{
	
	//Declarar os atributos do seu objeto/subclasse preguiça
	
	private String escalar;
	
	//Criar os construtores
	
	public Preguica(String nome, int idade, String som, String escalar)
	{
		super(nome, idade, som);
		this.escalar = escalar;
	}
	
	//Declarar os métodos get e set

	public String getEscalar() {
		return escalar;
	}

	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}
	
	//Criar meus próprios métodos
	
	public void imprimirPreguica()
	{
		System.out.println("\nNome da Preguiça: " + getNome()+ "\nSua idade: "+ getIdade()+ 
				"\nO som que emite: " + getSom() + "\nSua habilidade principal: " + escalar);
	}
	
	
	
	
	
	
	
	

}
