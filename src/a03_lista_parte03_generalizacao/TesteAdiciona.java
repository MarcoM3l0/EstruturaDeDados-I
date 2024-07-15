package a03_lista_parte03_generalizacao;

public class TesteAdiciona {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		System.out.println("------- Adicionar -------");
		System.out.println();
		
		lista.adicionar(new Aluno("Marco01", "Marco01@email.com"));
		lista.adicionar(new Aluno("Marco02", "Marco02@email.com"));
		lista.adicionar(new Aluno("Marco03", "Marco03@email.com"));
		lista.adicionar(new Aluno("Marco04", "Marco04@email.com"));
		
		System.out.println(lista);
		System.out.println();
		System.out.println("------------------------");

	}

}
