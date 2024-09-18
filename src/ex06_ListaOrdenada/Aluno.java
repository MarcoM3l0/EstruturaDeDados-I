package ex06_ListaOrdenada;

public class Aluno implements Comparable{
	
	String nome;
	double mediaGeral;
	String nomeCurso;
	int creditosCursados;
	
	public Aluno(String nome, double mediaGeral) {
		this.nome = nome;
		this.mediaGeral = mediaGeral;
	}

	@Override
	public String toString() {
		return  nome + "(" + mediaGeral + ")";
	}

	@Override
	public boolean equals(Object obj) {
		/*if(obj instanceof Aluno) {
			Aluno outro = (Aluno) obj;
			return this.nome.equals(outro.nome);
		}else {
			return false;
		}*/
		
		if (this == obj) return true;  // Verifica se são o mesmo objeto
	    if (obj == null || getClass() != obj.getClass()) return false; // Verifica se é da mesma classe
	    
	    Aluno outro = (Aluno) obj;
	    return this.nome.equals(outro.nome) && Double.compare(this.mediaGeral, outro.mediaGeral) == 0;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Aluno) {
			Aluno outro = (Aluno) o;
			
			if(this.mediaGeral < outro.mediaGeral) {
				return -1;
			}else if (this.mediaGeral > outro.mediaGeral) {
				return 1;
			}else {
				return 0;
			}
			
		}else {
			throw new RuntimeException("Objeto passado não é um Aluno!");
		}
	}
	

}
