package PacotePoli;

public class Cavalo extends AnimalPoli {
	
	//construtores
	
	public Cavalo()
	{
		super("Tipo animal: Elron");
	}
	
	//metodos herdados
	
	
	@Override //Herdando da classe mãe
	public void nome(String nomeAnimal)
	{
		System.out.println("\nNome do cavalo: " + nomeAnimal);
	}
	
	@Override //Herdando da classe abstrata AnimalPoli
	public void idade (int idadeAnimal)
	{
		System.out.println("\nA idade do animal é: " + idadeAnimal);
	}
	@Override //Herdando da classe abstrata AnimalPoli
	public void som( String somAnimal)
	{
		System.out.println("\nO som desse animal é um " + somAnimal);
	}
	
	

}
