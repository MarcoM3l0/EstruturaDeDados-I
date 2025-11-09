package a03_arvore_binaria_01;

public class Nodo {
	
	private Object info;
	
	private Nodo esquerda;
	private Nodo direita;

	public Nodo(Object info) {
		super();
		this.info = info;
	}

	public Nodo getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Nodo esquerda) {
		this.esquerda = esquerda;
	}

	public Nodo getDireita() {
		return direita;
	}

	public void setDireita(Nodo direita) {
		this.direita = direita;
	}

	public Object getInfo() {
		return info;
	}
}
