package a08_lista_ligada;

public class Aluno {
	
	String nome;
	String email;
	double mediaGeral;
	String nomeCurso;
	int creditosCursados;
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + " (" + email + ")";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj instanceof Aluno) {
			Aluno outro = (Aluno) obj;
			
			return this.nome.equals(outro.nome) && this.email.equals(outro.email);
		}else {
			return false;
		}
	}
	
	

}