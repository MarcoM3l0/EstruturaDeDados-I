package a03_lista_parte02_aloc_din;

public class TestePega {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		System.out.println("------- Pegar -------");
		System.out.println();
		
		lista.adicionar(new Aluno("Marco01", "Marco01@email.com"));
		lista.adicionar(new Aluno("Marco02", "Marco02@email.com"));
		lista.adicionar(new Aluno("Marco03", "Marco03@email.com"));
		lista.adicionar(new Aluno("Marco04", "Marco04@email.com"));
		
		System.out.println(lista.pega(3));
		System.out.println();
		System.out.println("---------------------");

	}

}
