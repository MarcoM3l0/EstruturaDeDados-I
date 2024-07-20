package a05_lista_parte01_busca;

public class TesteBusca {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		System.out.println("------- Teste Busca: especificação -------");
		System.out.println();
		
		lista.adicionar(new Aluno("Marco01", "Marco01@email.com"));
		System.out.println(lista.toString().equals("[Marco01 (Marco01@email.com)]"));
		
		lista.adicionar(new Aluno("Marco02", "Marco02@email.com"));
		System.out.println(lista.toString().equals("[Marco01 (Marco01@email.com), Marco02 (Marco02@email.com)]"));
		
		lista.adicionar(new Aluno("Marco03", "Marco03@email.com"));
		lista.adicionar(new Aluno("Marco04", "Marco04@email.com"));
		
		System.out.println(lista);
		
		Aluno buscaAluno = new Aluno("Marco04", "Marco04@email.com");
		int posicao = lista.busca(buscaAluno);
		System.out.println(posicao);
		
		
		System.out.println();
		System.out.println("------------------------------------------");
		
	}

}
