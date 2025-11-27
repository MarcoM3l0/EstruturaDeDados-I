package ex_pratica;

import a04_abb_p01.NodoABB;

public class ArvoreBinaria {
	
	private NodoABB raiz;
	
	public void adiciona(Comparable info) {
		
		this.raiz = adiciona(this.raiz, info);
	}
	
	private NodoABB adiciona(NodoABB nodo, Comparable info) {
		
		if(nodo == null) return new NodoABB(info);
		
		int comparacao = info.compareTo(nodo.getInfo());

		if(comparacao < 0 ) {
			
			NodoABB nodoEsq = adiciona(nodo.getEsquerdo(), info);
			nodo.setEsquerdo(nodoEsq);
			
		}
		if(comparacao > 0 ) {
			
			NodoABB nodoDir = adiciona(nodo.getDireito(), info);
			nodo.setDireito(nodoDir);
			
		}
		
		return nodo;
	}

	private NodoABB adicionar(NodoABB nodo, Comparable info, NodoABB pai) {
		
		if(nodo == null) {
			NodoABB novoNodo = new NodoABB(info);
			novoNodo.setPai(pai);
			return novoNodo;
		}
		
		int comparacao = info.compareTo(nodo.getInfo());
		
		if(comparacao < 0) nodo.setEsquerdo(adicionar(nodo.getEsquerdo(), info, nodo));
		else if(comparacao > 0) nodo.setDireito(adicionar(nodo.getDireito(), info, nodo));
		
		return nodo;
		
	}
	
	public NodoABB busca(Comparable info) {
		
		return busca(this.raiz, info);
		
	}
	
	private NodoABB busca(NodoABB nodo, Comparable info) {
		
		if(nodo == null) return null;
		
		int comparacao = info.compareTo(nodo.getInfo());
		
		if(comparacao == 0) return nodo;
		else if(comparacao < 0) return busca(nodo.getEsquerdo(), info);
		else return busca(nodo.getDireito(), info);
		
	}
	
	public void remover(Comparable info) {
		remover(busca(info));
	}

	private void remover(NodoABB nodo) {
		
		if(nodo == null) return;
		
		if(ehFolha(nodo)) {
			descarta(nodo);
		}
		
		else if(temApenasUmFilho(nodo)) {
			NodoABB filhoDoRemovido = pegaUnicoFilho(nodo);
			NodoABB paiDoRemovido = nodo.getPai();
			paiDoRemovido.trocaFilho(nodo, filhoDoRemovido);
		}
		
		else {
			NodoABB maiorEsquerdo = nodo.getEsquerdo().getMaior();
			nodo.setInfo(maiorEsquerdo.getInfo());
			remover(maiorEsquerdo);
		}
		
	}

	private NodoABB pegaUnicoFilho(NodoABB nodo) {
		return nodo.getEsquerdo() != null ? nodo.getEsquerdo() : nodo.getDireito();
	}

	private boolean temApenasUmFilho(NodoABB nodo) {
		return (nodo.getEsquerdo() == null) != (nodo.getDireito() == null) ;
	}

	private void descarta(NodoABB nodo) {
		NodoABB pai = nodo.getPai();
		
		if(pai == null) this.raiz = null;
		
		else {
			if(pai.getEsquerdo() == nodo) pai.setEsquerdo(null);
			else pai.setDireito(null);
		}
		
	}

	private boolean ehFolha(NodoABB nodo) {
		return (nodo.getEsquerdo() == null) && (nodo.getDireito() == null);
	}
	
	public boolean isEmpty() {
		return this.raiz == null;
	}
	
	public void isOrder(NodoABB nodo) {
		if(nodo != null) {
			
			isOrder(nodo.getEsquerdo());
			System.out.println(nodo.getInfo() + " ");
			isOrder(nodo.getDireito());
		}
	}
	
	public void preOrder(NodoABB nodo) {
		if(nodo != null) {
			System.out.println(nodo.getInfo() + " ");
			preOrder(nodo.getEsquerdo());
			preOrder(nodo.getDireito());
		}
	}
	
	public void posOrder(NodoABB nodo) {
		if(nodo != null) {
			posOrder(nodo.getEsquerdo());
			posOrder(nodo.getDireito());
			System.out.println(nodo.getInfo() + " ");
		}
	}
	
	public boolean contains(Comparable info) {
		return contains(info, this.raiz);
	}
	
	private boolean contains(Comparable info, NodoABB nodo) {
		
		if(nodo != null) {
			
			int comparacao = info.compareTo(nodo.getInfo());
			
			if(comparacao == 0) return true;
			else if(comparacao < 0) return contains(info, nodo.getEsquerdo());
			else if(comparacao > 0) return contains(info, nodo.getDireito());
			
		}
		
		return false;
		
	}
	
	public ArvoreBinaria clone() {
		ArvoreBinaria novaArvore = new ArvoreBinaria();
		
		novaArvore.raiz = cloneNodo(this.raiz, null);
		
		return novaArvore;
	}

	

	private NodoABB cloneNodo(NodoABB nodo, NodoABB pai) {
		if(nodo == null) return null;
		
		NodoABB novo = new NodoABB(nodo.getInfo());
		novo.setPai(pai);
		
		novo.setEsquerdo(cloneNodo(nodo.getEsquerdo(), novo));
		novo.setDireito(cloneNodo(nodo.getDireito(), novo));
		
		return novo;
		
	}
	
	public NodoABB getRoot() {
		return this.raiz;
	}
	
	public int getSize() {
		return getSize(this.raiz);
	}

	private int getSize(NodoABB nodo) {
		if(nodo == null) return 0;
		
		return 1 + getSize(nodo.getEsquerdo()) + getSize(nodo.getDireito());
	}
	
	public int grau(NodoABB nodo) {
		if(nodo == null) return 0;
		
		int count = 0;

		if(nodo.getEsquerdo() != null) count++;
		if(nodo.getDireito() != null) count++;
		
		return count;
	}
	
	public int nivel(Comparable info) {
		return nivel(this.raiz, info, 1);
	}

	private int nivel(NodoABB nodo, Comparable info, int nivelAtual) {
		
		if(nodo == null) return 0;
		
		int comparacao = info.compareTo(nodo.getInfo());
		
		if(comparacao == 0) return nivelAtual;
		if(comparacao < 0)  return nivel(nodo.getEsquerdo(), info, nivelAtual + 1);
		return nivel(nodo.getDireito(), info, nivelAtual + 1);
	}
	
	public int altura() {
		return altura(this.raiz);
	}

	private int altura(NodoABB nodo) {
		
		if(nodo == null) return -1;
		
		int altEsq = altura(nodo.getEsquerdo());
		int altDir = altura(nodo.getDireito());
		
		if(altEsq > altDir) {
			return 1 + altEsq;
		}else {
			return 1 + altDir;
		}
	}
	
	public NodoABB sucessor(Comparable info) {
		NodoABB nodo = busca(info);
		
		if(nodo == null) return null;
		
		if(nodo.getDireito() != null) return nodo.getDireito().getMenor();
		
		NodoABB atual = nodo;
		NodoABB pai = atual.getPai();
		
		while(pai != null && atual == pai.getDireito()) {
			atual = pai;
			pai = pai.getPai();
		}
		
		return (pai == null) ? null : pai;
			
	}
	
	public NodoABB antecessor(Comparable info) {
		
		NodoABB nodo = busca(info);
		
		if(nodo == null) return null;
		
		if(nodo.getEsquerdo() != null) return nodo.getEsquerdo().getMaior();
		
		NodoABB atual = nodo;
		NodoABB pai = atual.getPai();
		
		while(pai != null && atual == pai.getEsquerdo()) {
			atual = pai;
			pai = pai.getPai();
		}
		
		return (pai == null) ? null : pai;
	}

	public String toStringDESC() {
		StringBuilder sb = new StringBuilder();
		montaString(this.raiz, sb);
		return sb.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		montaStringPreAEsquerda(this.raiz, sb, 0);
		return sb.toString();
	}
	
	

	private void montaString(NodoABB nodo, StringBuilder sb) {
		
		if(nodo != null) {
			
			
			montaString(nodo.getDireito(), sb);
			sb.append(nodo.getInfo() + "\r\n");
			montaString(nodo.getEsquerdo(), sb);
			
		}
		
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
