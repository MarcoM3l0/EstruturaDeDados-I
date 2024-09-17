package ex08_Pilha;

public class TesteTamanho {

	public static void main(String[] args) {
		
		Pilha pilha = new PilhaArranjo();
		System.out.println(pilha);
		pilha.adiciona(new Aluno("Teste01", "Teste01@gmail.com"));
		System.out.println(pilha);
		
		pilha.adiciona(new Aluno("Teste02", "Teste02@gmail.com"));
		System.out.println(pilha);

		pilha.adiciona(new Aluno("Teste03", "Teste03@gmail.com"));
		System.out.println(pilha);
	}

}
