package a09_lista_duplamente_ligada;

public class TesteRemove {

	public static void main(String[] args) {
		
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste01", "Teste01@gmail.com"));
		System.out.println(lista);
		lista.remove(0);
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste02", "Teste02@gmail.com"));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste03", "Teste03@gmail.com"), 0);
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste04", "Teste04@gmail.com"));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste05", "Teste05@gmail.com"));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste06", "Teste06@gmail.com"));
		System.out.println(lista);

		lista.remove(3);
		System.out.println(lista);
	}

}
