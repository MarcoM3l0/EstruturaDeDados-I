package ex06_ListaOrdenada;

public class ListaArranjo<T> implements Lista<T>{
	private Object[] elementos = new Object[10];
	private int tamanho = 0;
	
	public void adiciona(T elemento) {
		
		garanteEspaco();
		
		if(tamanho > 0) {
			 int i = 0;
			    while (i < tamanho && elementos[i] != null && ((Comparable) elementos[i]).compareTo(elemento) < 0) {
			        i++;
			    }

			    for (int j = tamanho; j > i; j--) {
			        elementos[j] = elementos[j - 1];
			    }

			    elementos[i] = elemento;
			
		}else {
			elementos[tamanho] = elemento;
		}
		
		tamanho++;
	}
	
	
	public void adiciona(int posicao, T elemento) {
		
		garanteEspaco();
		
		if(tamanho >= posicao) {
			
			for(int i = tamanho; i > posicao; i--) {
				
				elementos[i] = elementos[i - 1];
			}
			
			elementos[posicao] = elemento;
			tamanho++;
		}
		
		adiciona(elemento);
	}
	
	
	public int tamanho() {
		
		return tamanho;
		
	}
	
	public T pega(int posicao) {
		
		Object resultado = null;
		
		if(posicao < elementos.length) {
			resultado = elementos[posicao];
		}
		
		return (T) resultado;
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
			
			this.elementos =  novaLista;
			
		}
	}
	
	
	public int busca(T elemento) {
		int resultado = -1;
		
		for(int i = 0; i < tamanho; i++) {
			
			if(elemento.equals(elementos[i])) {
				resultado = i;
				break;
			}
		}
		
		return resultado;
	}
	
	private int buscaOrdenada(T elemento) {
		
		Comparable<Object> comparable = (Comparable) elemento;
	    int resultado = -1;

	    for (int i = 0; i < tamanho; i++) {
	        T atual = (T) elementos[i];
	        int comparacaoMedia = comparable.compareTo(atual);
	        boolean comparacaoNome = elemento.equals(elementos[i]);
	        
	        if(comparacaoNome) {
	        	
		        if (comparacaoMedia == 0) { 
		            resultado = i;
		            break;
		        } else if (comparacaoMedia < 0) {  
		            break;
		        }
	        	
	        }

		    
	    }
	    
	    return resultado;
		
	}
	
	private int buscaBinaria(T elemento) {
		
		int inicio = 0;
	    int fim = tamanho - 1;

	    while (inicio <= fim) {
	        int meio = (inicio + fim) / 2;

	        int comparacao = ((Comparable) elemento).compareTo(elementos[meio]);

	        if (comparacao == 0) {
	        	
	            return meio;
	        } else if (comparacao > 0) {
	        	
	            inicio = meio + 1;
	        } else {
	        	
	            fim = meio - 1;
	        }
	    }

	    return -1;
		
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
