package ex_pratica;

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
		

		System.out.println("Antes de remover 20: ");
		System.out.println(abb.toString());
		
		abb.remover(20);
		
		System.out.println("Depois de remover 20: ");
		System.out.println(abb.toString());
		
		abb.adiciona(20);
		

		System.out.println(abb.toString());
		
		abb.isOrder(abb.busca(37));
		
	}

}
