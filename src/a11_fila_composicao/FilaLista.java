package a11_fila_composicao;

import a09_lista_duplamente_ligada.ListaDuplamenteLigada;

public class FilaLista implements Fila {
	
	private ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

	@Override
	public void adiciona(Object elemento) {
		lista.adiciona(elemento);

	}

	@Override
	public Object consulta() {
		return lista.pega(0);
	}

	@Override
	public Object excluir() {
		Object resultado = lista.pega(0);
		lista.remove(0);
		return resultado;
	}

	@Override
	public int tamanho() {
		return lista.tamanho();
	}

	@Override
	public boolean vazia() {
		return tamanho() == 0;
	}

	@Override
	public String toString() {
		return lista.toString();
	}

	
}
