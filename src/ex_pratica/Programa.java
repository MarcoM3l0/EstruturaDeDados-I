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
		abb.adiciona(6);
		abb.adiciona(4);
		

		System.out.println("Sucessor");
		System.out.println(abb.sucessor(37));
		System.out.println();
		
		System.out.println("antecessor");
		System.out.println(abb.antecessor(37));
		System.out.println();
		
		System.out.println("Altura");
		System.out.println(abb.altura());
		System.out.println();

		System.out.println("Nivel: ");
		System.out.println(abb.nivel(37));
		System.out.println(abb.nivel(20));
		System.out.println(abb.nivel(10));
		
		System.out.println();
		System.out.println("Size: ");
		System.out.println(abb.getSize());
		
		System.out.println();
		System.out.println("Grau do no: ");
		System.out.println(abb.grau(abb.busca(10)));
		System.out.println(abb.grau(abb.busca(5)));
		System.out.println(abb.grau(abb.busca(20)));
		System.out.println(abb.grau(abb.busca(37)));

		System.out.println();
		System.out.println("Original: ");
		System.out.println(abb.toString());
		
		System.out.println("Clone: ");
		
		ArvoreBinaria abbClone = abb.clone();
	
		System.out.println(abbClone.toString());

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
