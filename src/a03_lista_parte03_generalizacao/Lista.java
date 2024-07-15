package a03_lista_parte03_generalizacao;

public class Lista {
	
	private Object[] elementos = new Object[100];
	
	public void adicionar(Object elemento) {
		
		for(int i = 0; i < elementos.length; i++) {
			
			if(elementos[i] == null) {
				
				elementos[i] = elemento;
				break;
				
			}
			
		}
	}
	
	public void adicionar(Object elemento, int posicao) {
		
		int tamanho = tamanho();
		
		if(tamanho > posicao) {
			
			for(int i = tamanho; i > posicao; i--) {
				
				elementos[i] = elementos[i - 1];
				
			}
			
			elementos[posicao] = elemento;
		}
		
	}
	
	
	public int tamanho() {
		
		int resultado = 0;
		
		for(int i = 0; i < elementos.length; i++ ) {
			
			if(elementos[i] == null) {
				resultado = i;
				break;
			}
			
		}
		
		return resultado;
	}
	
	public Object pega(int posicao) {
		
		Object resultado = null;
		
		if(posicao < elementos.length) {
			resultado = elementos[posicao];
		}
		
		return resultado;
	}
	
	public void remover(int posicao) {
		
		int tamanho = tamanho();
		
		if(tamanho > posicao) {
			
			for(int i = posicao; i < tamanho; i++) {
				elementos[i] = elementos[i + 1];
			}
			
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
