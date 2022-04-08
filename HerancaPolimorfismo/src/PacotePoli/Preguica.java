package PacotePoli;

public class Preguica extends AnimalPoli {
	public Preguica()
	{
		super("Tipo Animal: Manhana");
	}
	
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nNome cachorro: "+ nomeAnimal);
	}
	
	@Override	
	public void idade(int idadeAnimal)
	{
		System.out.println("\nIdade: " + idadeAnimal);
	}
	
	@Override
	
	public void som(String somAnimal)
	{
		System.out.println("\nSom que a preguica emite: " + somAnimal);
	}
	
	public void subir()
	{
		System.out.println("\nUma das características da preguiça é correr");
	}
}
