package ex07_ListaEncadeada;

public interface Lista<T> {
	public void adiciona(T element);
	public void adiciona(T element, int posicao);
	public T pega(int posicao);
	public int busca(T element);
	public void remove(int posicao);
	public int tamanho();

}
