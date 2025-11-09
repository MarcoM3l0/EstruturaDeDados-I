package a03_arvore_binaria_01;


public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arvore arvore = new Arvore();
		Nodo raiz = arvore.criarRaiz("*");
		
		Nodo produto = arvore.adicionarEsquerdo(raiz, "+");
		Nodo divisao = arvore.adicionarDireito(raiz, "/");
		
		Nodo a = arvore.adicionarEsquerdo(produto, "a");
		Nodo b = arvore.adicionarDireito(produto, "b");
		
		Nodo c = arvore.adicionarEsquerdo(divisao, "c");
		Nodo d = arvore.adicionarDireito(divisao, "d");
		
		System.out.println(arvore.toStringCentral());

		Arvore copia = arvore.copia();

		System.out.println(copia.toStringCentral());
		
		Nodo resultado = arvore.busca("*");
		
		if(resultado != null)  System.out.println(resultado.getInfo());
		else System.out.println(resultado);
		
		resultado = arvore.irmao(raiz);
		if(resultado != null)  System.out.println(resultado.getInfo());
		else System.out.println(resultado);
		
		
		arvore.remove(divisao);

		System.out.println(arvore.toStringCentral());
		
		
		
		System.out.println("-------------------------------------------");
		copia = arvore.copia();
		System.out.println(arvore.toStringCentral());
		System.out.println(copia.toStringCentral());
		
		resultado = copia.busca("*");

		if(resultado != null)  System.out.println(resultado.getInfo());
		else System.out.println(resultado);
	}

}
