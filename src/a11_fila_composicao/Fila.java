package a11_fila_composicao;

public interface Fila {
	public void adiciona(Object elemento);
	public Object consulta();
	public Object excluir();
	public int tamanho();
	public boolean vazia();
	
}