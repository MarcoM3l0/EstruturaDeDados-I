package ex08_Pilha;

public class PilhaArranjo<T> implements Pilha<T> {
	
	private Object[] elementos = new Object[40];
	private int topo = -1;
	
	@Override
	public void adiciona(T elemento) {
		topo++;
		elementos[topo] = elemento;
		
	}

	@Override
	public T remove() {
		Object resultado = null;
		
		if(topo > -1) {
			
			resultado = elementos[topo];
			topo--;
		}
		
		return (T) resultado;
	}

	@Override
	public T consulta() {
	
		if(topo > -1) {
			
			return (T) elementos[topo];
		}
		
		return null;
	}

	@Override
	public int tamanho() {
		return topo + 1;
	}

	@Override
	public boolean vazia() {
		return tamanho() == 0;
	}
	
	public void limpa() {
		
		for(int i = topo; i > -1; i--) {
			remove();
		}
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i <= topo; ++i) {
			if (sb.length() > 1) {
				sb.append(", ");
			}
			sb.append(elementos[i]);
		}
		sb.append("]");
		return sb.toString();
	}

	
}
