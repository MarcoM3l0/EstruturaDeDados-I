package ex06_ListaOrdenada;

public class TesteBusca {

	public static void main(String[] args) {
		ListaArranjo<Aluno> lista = new ListaArranjo<Aluno>();
		
		lista.adiciona(new Aluno("Teste1", 9.0));
		lista.adiciona(new Aluno("Teste2", 8.5));
		lista.adiciona(new Aluno("Teste3", 7.2));
		lista.adiciona(new Aluno("Teste4", 6.8));
		lista.adiciona(new Aluno("Teste5", 9.5));
		lista.adiciona(new Aluno("Teste6", 8.0));
		lista.adiciona(new Aluno("Teste7", 7.7));
		lista.adiciona(new Aluno("Teste8", 6.9));
		lista.adiciona(new Aluno("Teste9", 9.1));
		lista.adiciona(new Aluno("Teste10", 8.8));
		System.out.println(lista);

		System.out.println(System.currentTimeMillis());
		System.out.println(lista.busca(new Aluno("Teste10", 8.8)));
		System.out.println(System.currentTimeMillis());

	}

}
