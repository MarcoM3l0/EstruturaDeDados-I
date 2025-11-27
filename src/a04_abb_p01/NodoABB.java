package a04_abb_p01;

public class NodoABB {
	
	private Comparable info;
	private NodoABB pai;
	private NodoABB esquerdo;
	private NodoABB direito;
	
	public NodoABB(Comparable info) {
		super();
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

	public NodoABB getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(NodoABB esquerdo) {
		this.esquerdo = esquerdo;
		if (esquerdo != null) esquerdo.setPai(this);
	}

	public NodoABB getDireito() {
		return direito;
	}

	public void setDireito(NodoABB direito) {
		this.direito = direito;
		if (direito != null) direito.setPai(this);
	}
	
	public void trocaFilho(NodoABB velho, NodoABB novo) {
		if(velho == this.esquerdo) setEsquerdo(novo);
		else if(velho == this.direito) setDireito(novo);
	}
	
	public NodoABB getMaior() {
		NodoABB atual = this;
		
		while(atual.getDireito() != null) atual = atual.getDireito();
		
		return atual;
	}
	
	public NodoABB getMenor() {
		NodoABB atual = this;
		
		while(atual.getEsquerdo() != null) atual = atual.getEsquerdo();
		
		return atual;
	}

	@Override
	public String toString() {
		return " [Nodo:" + info + "]";
	}
	
	
	
}
