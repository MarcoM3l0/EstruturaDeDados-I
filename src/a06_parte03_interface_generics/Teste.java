package a06_parte03_interface_generics;

public class Teste {

	public static void main(String[] args) {
		Lista<Aluno> lista = new ListaArranjo<Aluno>();
		
		lista.adiciona(new Aluno("teste1", "teste1@gmail.com"));
		System.out.println(lista.toString().equals("[teste1 (teste1@gmail.com)]"));
		
		lista.adiciona(new Aluno("teste2", "teste2@gmail.com"));
		System.out.println(lista.toString().equals("[teste1 (teste1@gmail.com), teste2 (teste2@gmail.com)]"));

		lista.adiciona(new Aluno("teste3", "teste3@gmail.com"));
		lista.adiciona(new Aluno("teste4", "teste4@gmail.com"));
		lista.adiciona(new Aluno("teste3", "teste3@gmail.com"));
		lista.adiciona(new Aluno("teste5", "teste5@gmail.com"));
		lista.adiciona(new Aluno("teste3", "teste3@gmail.com"));
		
		System.out.println(lista);
		
		Aluno buscar = new Aluno("teste3", "teste3@gmail.com");
		int posicao = lista.busca(buscar);
		System.out.println(posicao);

	}

}
