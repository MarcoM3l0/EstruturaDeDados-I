package ex06_ListaOrdenada;

public class TesteAdiciona {

	public static void main(String[] args) {
		ListaArranjo<Aluno> lista = new ListaArranjo<Aluno>();
		
		lista.adiciona(new Aluno("Teste1", 9));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste2", 9.9));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste3", 8.5));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste4", 10));
		System.out.println(lista);

	}

}
