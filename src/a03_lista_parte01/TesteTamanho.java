package a03_lista_parte01;

public class TesteTamanho {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		System.out.println("------- tamanho -------");
		System.out.println();
		
		lista.adicionar(new Aluno("Marco01", "Marco01@email.com"));
		lista.adicionar(new Aluno("Marco02", "Marco02@email.com"));
		lista.adicionar(new Aluno("Marco03", "Marco03@email.com"));
		lista.adicionar(new Aluno("Marco04", "Marco04@email.com"));
		
		System.out.println("       " + lista.tamanho());
		System.out.println();
		System.out.println("-----------------------");

	}

}
