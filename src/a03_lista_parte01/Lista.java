package a03_lista_parte01;

public class Lista {
	
	private Aluno[] alunos = new Aluno[100];
	
	public void adicionar(Aluno aluno) {
		
		for(int i = 0; i < alunos.length; i++) {
			
			if(alunos[i] == null) {
				
				alunos[i] = aluno;
				break;
				
			}
			
		}
	}
	
	public void adicionar(Aluno aluno, int posicao) {
		
		int tamanho = tamanho();
		
		if(tamanho > posicao) {
			
			for(int i = tamanho; i > posicao; i--) {
				
				alunos[i] = alunos[i - 1];
				
			}
			
			alunos[posicao] = aluno;
		}
		
	}
	
	public int tamanho() {
		
		int resultado = 0;
		
		for(int i = 0; i < alunos.length; i++ ) {
			
			if(alunos[i] == null) {
				resultado = i;
				break;
			}
			
		}
		
		return resultado;
	}
	
	public Aluno pega(int posicao) {
		
		Aluno resultado = null;
		
		if(posicao < alunos.length) {
			resultado = alunos[posicao];
		}
		
		return resultado;
	}
	
	public void remover(int posicao) {
		
		int tamanho = tamanho();
		
		if(tamanho > posicao) {
			
			for(int i = posicao; i < tamanho; i++) {
				alunos[i] = alunos[i + 1];
			}
			
		}
		
		
	}

	@Override
	public String toString() {
		
		StringBuilder resultado = new StringBuilder("[ ");
		
		for(int i = 0; i < alunos.length; i++) {
			
			if(alunos[i] != null) {
				
				if(i > 0) {
					resultado.append(", ");
				}
				
				resultado.append(alunos[i].toString());
				
			}
			
			else {
				break;
			}
			
		}
		
	
		
		return resultado.append(" ]").toString();
	}
	
	

}
