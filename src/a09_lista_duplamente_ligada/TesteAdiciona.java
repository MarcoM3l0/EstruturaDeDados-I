package a09_lista_duplamente_ligada;

public class TesteAdiciona {

	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste01", "Teste01@gmail.com"));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste02", "Teste02@gmail.com"));
		System.out.println(lista);
		
		lista.adicionaNoComeco(new Aluno("Teste03", "Teste03@gmail.com"));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste04", "Teste04@gmail.com"));
		System.out.println(lista);

	}

}
