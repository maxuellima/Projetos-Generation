package PacotePoli;

public abstract class AnimalPoli {

	//atributo
	
	private String tipoAnimal;
	
	public AnimalPoli(String tipoAnimal)
	{
		this.tipoAnimal = tipoAnimal;
	}
	
	//metodos 
	abstract public void nome (String nomeAnimal);
	abstract public void idade(int idadeAnimal);
	abstract public void som(String somAnimal);
	
	//metodos getters e setters

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	
}
