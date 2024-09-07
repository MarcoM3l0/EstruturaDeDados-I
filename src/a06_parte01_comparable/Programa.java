package a06_parte01_comparable;

public class Programa {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		lista.adicionar(new Candidato("Teste1", 20, 20));
		lista.adicionar(new Candidato("Teste2", 20, 30));
		lista.adicionar(new Candidato("Teste3", 29, 40));
		lista.adicionar(new Candidato("Teste4", 30, 10));
		lista.adicionar(new Candidato("Teste5", 19, 51));
		lista.adicionar(new Candidato("Teste6", 20, 51));
		lista.adicionar(new Candidato("Teste7", 25, 25));
		
		Candidato maior = null;
		
		for(int i = 0; i < lista.tamanho(); i++) {
			
			Candidato candidato = (Candidato) lista.pega(i);
			
			if(maior == null || candidato.compareTo(maior) > 0) {
				maior = candidato;
			}
			
		}
		
		System.out.println("Candidato melhor colocação: " + maior);

	}

}
