package a11_fila_composicao;

public class TesteAdiciona {

	public static void main(String[] args) {
		Fila fila = new FilaLista();
		System.out.println(fila.tamanho() == 0);
		System.out.println(fila.vazia() == true);
		System.out.println(fila.toString().equals("[]"));

		fila.adiciona(new Aluno("Teste01", "Test01@gmail.com"));
		System.out.println(fila.tamanho() == 1);
		System.out.println(fila.toString().equals("[Teste01 (Test01@gmail.com)]"));
		
		fila.adiciona(new Aluno("Teste02", "Teste02@gmail.com"));
		System.out.println(fila.toString().equals("[Teste01 (Test01@gmail.com), Teste02 (Teste02@gmail.com)]"));

		fila.adiciona(new Aluno("Teste03", "Teste03@gmail.com"));
		System.out.println(fila.tamanho() == 3);
		System.out.println(fila.vazia() == false);

	}

}
