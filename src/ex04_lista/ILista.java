package ex04_lista;

public interface ILista<T> {
	
	public void adicionar(T elemento);
	public void adicionar(T elemento, int posicao);
	public int tamanho();
	public T pega(int posicao);
	public void remover(int posicao);
	

}
