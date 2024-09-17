package ex08_Pilha;

public class TesteAdiciona {

	public static void main(String[] args) {
		
		PilhaArranjo<Aluno> pilha = new PilhaArranjo<Aluno>();
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		System.out.println(pilha.remove());
		System.out.println(pilha.consulta());
		
		pilha.adiciona(new Aluno("Teste01", "Teste01@gmail.com"));
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
		pilha.adiciona(new Aluno("Teste02", "Teste02@gmail.com"));
		System.out.println(pilha);
		System.out.println(pilha.tamanho());

		pilha.adiciona(new Aluno("Teste03", "Teste03@gmail.com"));
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
		System.out.println(pilha.remove());
		System.out.println(pilha.consulta());
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
		System.out.println(pilha);
		pilha.limpa();
		System.out.println(pilha);
	}

}
