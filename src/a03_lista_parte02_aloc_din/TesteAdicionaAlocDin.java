package a03_lista_parte02_aloc_din;

public class TesteAdicionaAlocDin {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		System.out.println("------- Adicionar Alocação dinâmica -------");
		System.out.println();
		
		lista.adicionar(new Aluno("Marco01", "Marco01@email.com"));
		lista.adicionar(new Aluno("Marco02", "Marco02@email.com"));
		lista.adicionar(new Aluno("Marco03", "Marco03@email.com"));
		lista.adicionar(new Aluno("Marco04", "Marco04@email.com"));
		
		System.out.println(lista);
		System.out.println();
		System.out.println("-------------------------------------------");
		
		for(int i = 0; i < 3000; i++) {
			lista.adicionar(new Aluno("Jose" + (i + 1), "Jose"+ (i + 1) +"@email.com"));
		}
		
		System.out.println(lista);
		
		System.out.println();
		System.out.println("-------------------------------------------");
	}

}
