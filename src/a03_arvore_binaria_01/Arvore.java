package a03_arvore_binaria_01;

public class Arvore {
	private Nodo raiz;

	public Arvore() {
	}
	

	public Nodo getRaiz() {
		return raiz;
	}
	
	public Nodo criarRaiz(Object info) {
		this.raiz = new Nodo(info);
		return this.raiz;
	}

	public Nodo adicionarEsquerdo(Nodo elemento, Object info) {
		Nodo novo = new Nodo(info);
		elemento.setEsquerda(novo);
		return novo;
	}
	
	public Nodo adicionarDireito(Nodo elemento, Object info) {
		Nodo novo = new Nodo(info);
		elemento.setDireita(novo);
		return novo;
	}
	
	public Nodo busca(Object info) {
		return busca(this.raiz, info);
		
	}
	
	private Nodo busca(Nodo atual, Object info) {
		
		if (atual == null) return null;
		if(atual.getInfo() == info) return atual;
		
		Nodo resultado = busca(atual.getEsquerda(), info);
		if(resultado != null) return resultado;
		
		return busca(atual.getDireita(), info);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		montaStringPreAEsquerdo(raiz, sb, 0);
		return sb.toString();
	}
	
	public String toStringCentral() {
	    StringBuilder sb = new StringBuilder();
	    montaStringCentralAEsquerdo(raiz, sb, 0);
	    return sb.toString();
	}

	
	private void montaStringPreAEsquerdo(Nodo nodo, StringBuilder sb, int nivel) {
		
		if(nodo != null) {
			sb.append("\r\n");
			for(int i = 0; i < nivel; i++) {
				sb.append(" ");
			}
			sb.append(String.valueOf(nodo.getInfo()));

			montaStringPreAEsquerdo(nodo.getEsquerda(), sb, nivel+1);
			montaStringPreAEsquerdo(nodo.getDireita(), sb, nivel+1);
			
		}
	}

	
	private void montaStringCentralAEsquerdo(Nodo nodo, StringBuilder sb, int nivel) {
		
		if(nodo != null) {
			
			if(nodo.getEsquerda() != null) sb.append(" (");
			
			montaStringCentralAEsquerdo(nodo.getEsquerda(), sb, nivel+1);
			
			for(int i = 0; i < nivel; i++) {
				sb.append(" ");
			}
			sb.append(String.valueOf(nodo.getInfo()));

			montaStringCentralAEsquerdo(nodo.getDireita(), sb, nivel+1);
			if(nodo.getDireita() != null) sb.append(") ");
			
		}
	}
	

}
