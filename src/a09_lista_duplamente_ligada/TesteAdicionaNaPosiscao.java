package a09_lista_duplamente_ligada;

public class TesteAdicionaNaPosiscao {

	public static void main(String[] args) {
		
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste01", "Teste01@gmail.com"));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste02", "Teste02@gmail.com"));
		System.out.println(lista);

		lista.adiciona(new Aluno("Teste03", "Teste03@gmail.com"), 0);
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste04", "Teste04@gmail.com"), 1);
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste05", "Teste05@gmail.com"), 4);
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste06", "Teste06@gmail.com"), 7);
		System.out.println(lista);
		
		System.out.println(lista.toString().equals("[Teste03 (Teste03@gmail.com), Teste04 (Teste04@gmail.com), Teste01 (Teste01@gmail.com), Teste02 (Teste02@gmail.com), Teste05 (Teste05@gmail.com)]"));
		

	}

}
