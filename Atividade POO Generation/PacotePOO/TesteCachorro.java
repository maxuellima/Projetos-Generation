package PacotePOO;

public class TesteCachorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cachorro = new Cachorro("Sartre Daniel", 2, "Late muito",  "O cachorro mais rápido da Várzea");
		
		Cavalo cavalo = new Cavalo("Pangaré da Silva", 13, "Relincha pouco", "Preguiçoso, só faz andar");
		
		Preguica preguica = new Preguica("Lazy Day", 22, "Nenhum, caladinha na dela", "Sobe em uma árvore por dia");
		
		cachorro.imprimir();
		cachorro.imprimirDog();
		cavalo.imprimir();
		cavalo.imprimirCavalo();
		preguica.imprimir();
		preguica.imprimirPreguica();

	}

}
