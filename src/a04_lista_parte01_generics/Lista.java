package a04_lista_parte01_generics;

public class Lista<T> {
	
	private Object[] elementos = new Object[10];
	private int tamanho = 0;
	
	public void adicionar(T elemento) {
		
		garanteEspaco();
		elementos[tamanho] = elemento;
		tamanho++;
	}
	
	
	public void adicionar(T elemento, int posicao) {
		
		garanteEspaco();
		
		if(tamanho >= posicao) {
			
			for(int i = tamanho; i > posicao; i--) {
				
				elementos[i] = elementos[i - 1];
			}
			
			elementos[posicao] = elemento;
			tamanho++;
		}
	}
	
	
	public int tamanho() {
		
		return tamanho;
		
	}
	
	public T pega(int posicao) {
		
		T resultado = null;
		
		if(posicao < elementos.length) {
			resultado = (T) elementos[posicao];
		}
		
		return resultado;
	}
	
	public void remover(int posicao) {
		
		if(tamanho > posicao) {
			
			for(int i = posicao; i < tamanho; i++) {
				elementos[i] = elementos[i + 1];
			}
			
			tamanho--;
		}
	}
	
	
	private void garanteEspaco() {
		
		if(tamanho() == elementos.length) {
			
			int novoLimite = elementos.length * 2;
			
			
			System.out.println("Dobrando o espaço de " + elementos.length + " para " + novoLimite + "...");
			System.out.println("------------------------------------");
			
			Object[] novaLista = new Object[novoLimite];
			
			for(int i = 0; i < elementos.length; i++) {
				novaLista[i] = elementos[i];
			}
			
			this.elementos = novaLista;
			
		}
	}

	
	@Override
	public String toString() {
		
		StringBuilder resultado = new StringBuilder("[ ");
		
		for(int i = 0; i < elementos.length; i++) {
			
			if(elementos[i] != null) {
				
				if(i > 0) {
					resultado.append(", ");
				}
				
				resultado.append(elementos[i].toString());
			}
			
			else {
				break;
			}
		}
		return resultado.append(" ]").toString();
	}
	
	

}
