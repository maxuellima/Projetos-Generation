package PacotePOO;

public class TesteCachorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cachorro = new Cachorro("Sartre Daniel", 2, "Late muito",  "O cachorro mais r�pido da V�rzea");
		
		Cavalo cavalo = new Cavalo("Pangar� da Silva", 13, "Relincha pouco", "Pregui�oso, s� faz andar");
		
		Preguica preguica = new Preguica("Lazy Day", 22, "Nenhum, caladinha na dela", "Sobe em uma �rvore por dia");
		
		cachorro.imprimir();
		cachorro.imprimirDog();
		cavalo.imprimir();
		cavalo.imprimirCavalo();
		preguica.imprimir();
		preguica.imprimirPreguica();

	}

}
