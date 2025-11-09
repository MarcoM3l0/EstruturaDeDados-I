package a04_abb_p01;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArvoreBinaria abb = new ArvoreBinaria();

		abb.adiciona(37);
		abb.adiciona(20);
		abb.adiciona(10);
		abb.adiciona(80);
		abb.adiciona(100);
		abb.adiciona(90);
		abb.adiciona(30);
		abb.adiciona(180);
		abb.adiciona(5);

		System.out.println("Antes de remover: ");
		System.out.println(abb);
		
		abb.remover(abb.busca(10));
		
		System.out.println();
		
		System.out.println("Depois de remover: ");
		System.out.println(abb);
		
	}

}
