package a03_lista_parte01;

public class Aluno {
	String nome;
	private String email;
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return nome + " (" + email + ")";
	}
}
