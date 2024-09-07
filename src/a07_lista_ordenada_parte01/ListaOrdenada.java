package a07_lista_ordenada_parte01;

public class ListaOrdenada {
	
	private Object[] elementos = new Object[20];
	private int tamanho = 0;
	
	public void adiciona(Comparable<Object> elemento) {
		garanteEspaco();
		
		for(int i = 0; i < tamanho(); i++) {
			
			System.out.println("entrou no laço!!");
			
			if(elemento.compareTo(elementos[i]) < 0) {
				
				for(int j = tamanho(); j > i; j--) {
					elementos[j] = elementos[j-1];
				}
				
				elementos[i] = elemento;
				tamanho++;
			}
			
		}
	}

	private void garanteEspaco() {
		
		if(tamanho() == elementos.length) {
			 
			int novoLimite = elementos.length * 2;
			
			Object[] novaLista = new Object[novoLimite];
			
			for(int i = 0; i < tamanho(); i++) {
				novaLista[i] = elementos[i];
			}
			
			this.elementos = novaLista;
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	
	public Comparable pega(int posicao) {
		Comparable resultado = null;
		
		if(posicao < elementos.length) {
			resultado = (Comparable) elementos[posicao];
		}
		
		return resultado;
	}
	
	public void remove(int posicao) {
		
		if(posicao < elementos.length) {
			
			for(int i = posicao; i < tamanho(); i++) {
				elementos[i] = elementos[i + 1];
			}
			
			tamanho--;
		}
	}
	
	public boolean contem(Comparable elemento) {
		return false;
	}

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder("[");
		
		for(int i = 0; i < tamanho(); i++) {
			
			if(i > 0) {
				resultado.append(", ");
			}
			
			resultado.append(elementos.toString());
			
		}
		
		resultado.append("]");
		return resultado.toString();
	}
	
	
}
