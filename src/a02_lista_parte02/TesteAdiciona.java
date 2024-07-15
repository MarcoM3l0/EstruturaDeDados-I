package a02_lista_parte02;

public class TesteAdiciona {

	public static void main(String[] args) {
		
		Lista lista = new Lista();

		lista.adicionar(new Aluno("Marco01", "Marco01@email.com"));
		lista.adicionar(new Aluno("Marco02", "Marco02@email.com"));
		lista.adicionar(new Aluno("Marco03", "Marco03@email.com"));
		lista.adicionar(new Aluno("Marco04", "Marco04@email.com"));
		
		System.out.println(lista);

	}

}
