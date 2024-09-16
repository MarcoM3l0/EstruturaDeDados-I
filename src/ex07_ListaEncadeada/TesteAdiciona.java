package ex07_ListaEncadeada;

import java.util.*;

public class TesteAdiciona {

	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste01", "Teste01@gmail.com"));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste02", "Teste02@gmail.com"));
		System.out.println(lista);
		
		System.out.println(lista.busca(new Aluno("Teste03", "Teste03@gmail.com")));
		
		lista.adicionaNoComeco(new Aluno("Teste03", "Teste03@gmail.com"));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Teste04", "Teste04@gmail.com"));
		System.out.println(lista);

		int busca = lista.busca(new Aluno("Teste03", "Teste03@gmail.com"));
		
		System.out.println(busca);
		
		lista.remove(busca);
		busca = lista.busca(new Aluno("Teste03", "Teste03@gmail.com"));
		
		System.out.println(busca);
		
		lista.adicionaNoComeco(new Aluno("Teste03", "Teste03@gmail.com"));
		
		System.out.println(lista.pega(3));
		
		System.out.println(lista);
		lista.limpezaCompleta();
		System.out.println(lista);
		
		List<Aluno> elementos = new ArrayList<>();
		
		elementos.add(new Aluno("Teste01", "Teste01@gmail.com"));
		elementos.add(new Aluno("Teste02", "Teste02@gmail.com"));
		elementos.add(new Aluno("Teste02", "Teste02@gmail.com"));
		elementos.add(new Aluno("Teste02", "Teste02@gmail.com"));
		elementos.add(new Aluno("Teste03", "Teste03@gmail.com"));
		elementos.add(new Aluno("Teste04", "Teste04@gmail.com"));
		elementos.add(new Aluno("Teste04", "Teste04@gmail.com"));
		
		/* for (Object elemento : elementos) {
	            lista.adiciona(elemento); 
        }*/
		 
		 
		 Set<Aluno> elementosEncontrados = new HashSet<>();

		 for (Aluno aluno : elementos) {
	            if (elementosEncontrados.add(aluno)) {
	                lista.adiciona(aluno);
	            }
	        }
        
        System.out.println(lista);
	}

}
