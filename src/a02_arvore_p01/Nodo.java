package a02_arvore_p01;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
	private Object info;
	private Nodo pai;
	private List<Nodo> filhos = new ArrayList<Nodo>();
	
	public Nodo(Object info) {
		this.info = info;
	}

	
	public Object getInfo() {
		return info;
	}
	
	public Nodo getPai() {
		return pai;
	}
	
	public List<Nodo> getFilhos() {
		return filhos;
	}
	
	public Nodo addFilho(Object info) {
		return addFilho(new Nodo(info));
	}
	
	private Nodo addFilho(Nodo nodoFilho) {
		nodoFilho.pai = this;
		filhos.add(nodoFilho);
		return nodoFilho;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		stringPreOrdem(this, sb, 0);
		return sb.toString();
	}


	private static void stringPreOrdem(Nodo nodo, StringBuilder sb, int nivel) {
		// Primeiro processa o nó
		sb.append(pegaEspacos(nivel));
		sb.append(nodo.info.toString());
		sb.append("\n");
		// Depois processa os filhos
		for (int i = 0; i < nodo.filhos.size(); ++i) {
			stringPreOrdem(nodo.filhos.get(i), sb, nivel + 1);
		}
	}
	
	private static void stringPosOrdem(Nodo nodo, StringBuilder sb, int nivel) {
		// Primeiro processa os filhos
		for (int i = 0; i < nodo.filhos.size(); ++i) {
			stringPosOrdem(nodo.filhos.get(i), sb, nivel + 1);
		}
		// Depois processa o nó
		sb.append(pegaEspacos(nivel));
		sb.append(nodo.info.toString());
		sb.append("\n");
	}
	
	private static String pegaEspacos(int qtd) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < qtd; ++i) {
			sb.append("  ");
		}
		return sb.toString();
	}
}





