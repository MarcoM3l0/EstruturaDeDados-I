package a01_recusao;


public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(potenciaRec(2, 3));	
		System.out.println(somaRec(5));

	}
	
	public static long potenciaRec(int x, int y) {
		if(y == 1) return x;
		else return x * potenciaRec(x, y -1);
	}
	
	public static long somaRec(int n) {
		 if(n <= 0) return n;
		 else return n + somaRec(n - 1);
	}

}
