package ex05_busca;

public class Lista {
	
	private Object[] elementos = new Object[10];
	private int tamanho = 0;
	
	public void adicionar(Object elemento) {
		
		garanteEspaco();
		elementos[tamanho] = elemento;
		tamanho++;
	}
	
	
	public void adicionar(Object elemento, int posicao) {
		
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
	
	public Object pega(int posicao) {
		
		Object resultado = null;
		
		if(posicao < elementos.length) {
			resultado = elementos[posicao];
		}
		
		return resultado;
	}
	
	public void remove(int posicao) {
		
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
	
	
	public int busca(Object elemento) {
		int resultado = -1;
		
		for(int i = 0; i < tamanho; i++) {
			
			if(elemento.equals(elementos[i])) {
				resultado = i;
				break;
			}
		}
		
		return resultado;
	}
	
	
	public int buscaUltimo(Object elemento) {
		int resultado = -1;
		
		for(int i = tamanho; i >= 0; i--) {
			
			if(elemento.equals(elementos[i])) {
				resultado = i;
			}
			
		}
		
		return resultado;
	}
	
	public void removeTodos(Object elemento) {
		
		for(int i = 0; i < tamanho; i++) {
			
			if(elemento.equals(elementos[i])) {
				remove(i);
			}
		}
		
	}

	
	@Override
	public String toString() {
		
		StringBuilder resultado = new StringBuilder("[");
		
		for(int i = 0; i < tamanho; i++) {
				
			if(i > 0) {
				resultado.append(", ");
			}
			
			resultado.append(elementos[i].toString());
			
		}
		return resultado.append("]").toString();
	}
	
	

}
