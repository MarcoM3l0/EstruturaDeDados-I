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

	@Override
	public String toString() {
		return "[Nodo:" + this.info +"]";
	}
	
	

}
