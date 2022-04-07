package PacotePOO;

public class Cavalo extends Animal {
	
	//Declarar atributos do meu objeto
	
	private String correr2;
	
	//Criar os contrutores
	
	public Cavalo(String nome, int idade, String som, String correr2)
	{
		super(nome, idade, som);
		this.correr2 = correr2;
	}

	//Escrever os métodos get e set
	
	public String getCorrer2() {
		return correr2;
	}

	public void setCorrer2(String correr2) {
		this.correr2 = correr2;
	}
	
	//criar meus métodos
	
	public void imprimirCavalo()
	{
		System.out.println("\nNome do Cavalo: " + getNome()+ "\nSua idade: "+ getIdade()+ 
				"\nO som que emite: " + getSom() + "\nSua habilidade principal: " + correr2);
	}
	
	
	

}
