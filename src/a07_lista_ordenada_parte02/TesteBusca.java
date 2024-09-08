package a07_lista_ordenada_parte02;

public class TesteBusca {

	public static void main(String[] args) {
		ListaOrdenada lista = new ListaOrdenada();
		
		lista.adiciona(new Aluno("Teste1", 9.4));
		System.out.println(lista);

		lista.adiciona(new Aluno("Teste2", 5.6));
		System.out.println(lista);

		lista.adiciona(new Aluno("Teste3", 7.4));
		System.out.println(lista);

		lista.adiciona(new Aluno("Teste4", 8.5));
		System.out.println(lista);

		lista.adiciona(new Aluno("Teste6", 3.2));
		System.out.println(lista);

		lista.adiciona(new Aluno("Teste7", 10));
		System.out.println(lista);
		
		System.out.println();
		
		int posicao = lista.busca(new Aluno("Teste6", 10));
		System.out.println(posicao);

		posicao = lista.busca(new Aluno("Teste4", 0));
		System.out.println(posicao);

	}

}
