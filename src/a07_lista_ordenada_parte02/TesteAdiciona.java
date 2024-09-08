package a07_lista_ordenada_parte02;

public class TesteAdiciona {

	public static void main(String[] args) {
		
		ListaOrdenada lista = new ListaOrdenada();
		
		lista.adiciona(new Aluno("Test1", 10));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Test2", 9));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Test3", 9.5));
		System.out.println(lista);
	
		lista.adiciona(new Aluno("Test4", 9.9));
		System.out.println(lista);
	}
	

}
