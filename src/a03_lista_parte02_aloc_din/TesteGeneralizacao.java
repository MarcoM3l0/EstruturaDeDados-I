package a03_lista_parte02_aloc_din;

public class TesteGeneralizacao {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		System.out.println("------- Teste Generalização -------");
		System.out.println();
		
		lista.adicionar(new Aluno("Marco01", "Marco01@email.com"));
		lista.adicionar(new Aluno("Marco02", "Marco02@email.com"));
		lista.adicionar(new Professor("Marco03", "Marco03@email.com"));
		lista.adicionar(new Aluno("Marco04", "Marco04@email.com"));
		
		System.out.println(lista);
		System.out.println();
		System.out.println("-----------------------------------");
		
		System.out.println(((Aluno) lista.pega(1)).nome.equals("Marco02"));
		System.out.println(((Professor) lista.pega(2)).nome.equals("Marco03"));
		System.out.println();
		System.out.println("-----------------------------------");
		
		Object elemento = lista.pega(2);
		
		if(elemento instanceof Aluno) {
			System.out.println(((Aluno) lista.pega(2)).nome.equals("Marco04"));
		} else if(elemento instanceof Professor) {
			System.out.println(((Professor) lista.pega(2)).nome.equals("Marco03"));
		}
		
		System.out.println();
		System.out.println("-----------------------------------");
		
		System.out.println(lista);
		lista.remover(1);
		
		System.out.println(lista);
		lista.remover(2);
		
		System.out.println(lista);
		lista.remover(2);
		
		System.out.println();
		System.out.println("-----------------------------------");
		
		

	}

}
