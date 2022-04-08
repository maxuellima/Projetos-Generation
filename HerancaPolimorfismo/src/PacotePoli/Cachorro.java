package PacotePoli;

public class Cachorro extends AnimalPoli {
	
	public Cachorro()
	{
		super("Tipo Animal: Cachorro");
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
		System.out.println("\nSom que seu cachorro emite: " + somAnimal);
	}
	
	public void corre()
	{
		System.out.println("\nUma das características do cachorro é correr");
	}

}
