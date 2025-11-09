package a04_abb_p01;

public class ArvoreBinaria {
	
	private NodoABB raiz;
	
	public void adiciona(Comparable info) {
		NodoABB novoNodo = new NodoABB(info);
		
		if(this.raiz == null) this.raiz = novoNodo;
		
		else {
			
			NodoABB nodo = this.raiz;
			
			while(nodo != null) {
				
				int comparacao = info.compareTo(nodo.getInfo());
				
				if(comparacao < 0) {
					
					if(nodo.getEsquerdo() == null) {
						nodo.setEsquerdo(novoNodo);
						break;
					}
					
					else nodo = nodo.getEsquerdo();
					
				}else if (comparacao > 0) {
					
					if(nodo.getDireito() == null) {
						nodo.setDireito(novoNodo);
						break;
					}
					
					else nodo = nodo.getDireito();
					
				}else break;
			}
		}
	}
	
	public NodoABB busca(Comparable info) {
		
		NodoABB nodo = this.raiz;
		
		while(nodo != null) {
			
			int comparacao = info.compareTo(nodo.getInfo());	
			if(comparacao == 0) return nodo;
			else if (comparacao < 0) nodo = nodo.getEsquerdo();
			else if (comparacao > 0) nodo = nodo.getDireito();
			
		}
		
		return null;
	}
	
	public void remover(NodoABB nodo) {
	    if (nodo == null) return;

	    // CASO 1: Nó é folha
	    if (nodo.getEsquerdo() == null && nodo.getDireito() == null) {
	        NodoABB pai = nodo.getPai();
	        if (pai == null) {
	            this.raiz = null;
	        } else {
	            if (pai.getEsquerdo() == nodo) pai.setEsquerdo(null);
	            else pai.setDireito(null);
	        }
	    }

	    // CASO 2: Tem apenas um filho
	    else if (nodo.getEsquerdo() == null || nodo.getDireito() == null) {
	        NodoABB filho = (nodo.getEsquerdo() != null) ? nodo.getEsquerdo() : nodo.getDireito();
	        NodoABB pai = nodo.getPai();

	        if (pai == null) {
	            this.raiz = filho;
	            filho.setPai(null);
	        } else {
	            if (pai.getEsquerdo() == nodo) pai.setEsquerdo(filho);
	            else pai.setDireito(filho);
	            filho.setPai(pai);
	        }
	    }

	    // CASO 3: Tem dois filhos
	    else {
	        NodoABB substituto = nodo.getEsquerdo().getMaior();
	        nodo.setInfo(substituto.getInfo());
	        remover(substituto);
	    }
	}


	
	private NodoABB pegaUnicoFilho(NodoABB nodo) {
		return nodo.getEsquerdo() != null ? nodo.getEsquerdo() : nodo.getDireito();
	}

	private boolean temApenasUmFilho(NodoABB nodo) {
		// TODO Auto-generated method stub
		return (nodo.getEsquerdo() == null) != (nodo.getDireito() == null);
	}

	private void descarta(NodoABB nodo) {
		NodoABB pai = nodo.getPai();
		
		if(pai == null) this.raiz = null;
		else pai.trocaFilho(nodo, null);
		
	}

	private boolean temfilho(NodoABB nodo) {
		return nodo.getEsquerdo() != null || nodo.getDireito() != null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		montaStringPreAEsquerda(this.raiz, sb, 0);
		return sb.toString();
	}


	private void montaStringPreAEsquerda(NodoABB nodo, StringBuilder sb, int nivel) {
		if(nodo != null) {
			
			
			sb.append("\r\n");
			
			for(int i = 0; i < nivel; i++) sb.append("  ");
			
			sb.append(String.valueOf(nodo.getInfo()));
			montaStringPreAEsquerda(nodo.getEsquerdo(), sb, nivel +1);
			montaStringPreAEsquerda(nodo.getDireito(), sb, nivel +1);
			
			
		}
		
	}
	
	
	
}
