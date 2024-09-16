package a11_fila_composicao;

public class TesteConsulta {

	public static void main(String[] args) {
		Fila fila = new FilaLista();
		
		fila.adiciona(new Aluno("Teste01", "Teste01@gmail.com"));
		System.out.println(fila.consulta() instanceof Aluno);
		System.out.println(fila.consulta().toString().equals("Teste01 (Teste01@gmail.com)"));

		fila.adiciona(new Aluno("Teste02", "Teste02@gmail.com"));
		System.out.println(fila.consulta().toString().equals("Teste01 (Teste01@gmail.com)"));

		fila.adiciona(new Aluno("Teste03", "Teste03@gmail.com"));
		System.out.println(fila.consulta().toString().equals("Teste01 (Teste01@gmail.com)"));
	

	}

}
