package a11_fila_composicao;

public class TesteRemove {

	public static void main(String[] args) {
		Fila fila = new FilaLista();
		
		fila.adiciona(new Aluno("Teste01", "Teste01@gmail.com"));
		System.out.println(fila.excluir().toString().equals("Teste01 (Teste01@gmail.com)"));

		fila.adiciona(new Aluno("Teste02", "Teste02@gmail.com"));
		fila.adiciona(new Aluno("Teste03", "Teste03@gmail.com"));

		System.out.println(fila.excluir().toString().equals("Teste02 (Teste02@gmail.com)"));
		System.out.println(fila.excluir().toString().equals("Teste03 (Teste03@gmail.com)"));
	

	}

}
