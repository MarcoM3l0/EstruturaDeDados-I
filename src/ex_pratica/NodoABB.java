package ex_pratica;

public class NodoABB {
	
	private Comparable info;
	private NodoABB pai;
	private NodoABB direito;
	private NodoABB esquerdo;
	
	public NodoABB(Comparable info) {
		this.info = info;
	}

	public Comparable getInfo() {
		return info;
	}

	public void setInfo(Comparable info) {
		this.info = info;
	}

	public NodoABB getPai() {
		return pai;
	}

	public void setPai(NodoABB pai) {
		this.pai = pai;
	}

	public NodoABB getDireito() {
		return direito;
	}

	public void setDireito(NodoABB direito) {
		this.direito = direito;
	}

	public NodoABB getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(NodoABB esquerdo) {
		this.esquerdo = esquerdo;
	}
	
	public void trocaFilho(NodoABB removido, NodoABB novo) {
		if(removido == this.esquerdo) setEsquerdo(novo);
		else if(removido == this.direito) setDireito(novo);
	}
	
	public NodoABB getMaior() {
		NodoABB atual = this;

		while(atual.getDireito() != null) atual = atual.getDireito();
		
		return atual;
	}

	@Override
	public String toString() {
		return "[Nodo:" + this.info +"]";
	}
	
	

}
