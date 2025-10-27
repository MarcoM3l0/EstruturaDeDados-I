package a02_arvore_p01;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo tcc = new Nodo("Trabalho de Conclusão");
		Nodo cap1 = tcc.addFilho("1. Introdução");
		Nodo cap2 = tcc.addFilho("2. Objetivos");
		Nodo cap3 = tcc.addFilho("3 Metodologia");

		cap2.addFilho("2.1 Gerais");
		cap2.addFilho("2.2 Específicos");

		Nodo cap31 = cap3.addFilho("3.1 Materias");
		cap31.addFilho("3.1.1 Hardware usado");
		cap31.addFilho("3.1.2 Software usado");
		System.out.println(tcc);

	}

}
