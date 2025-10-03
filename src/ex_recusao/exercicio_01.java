package ex_recusao;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(expoenteN(2, 2));
		double[] teste = {1.5, 2.3, 3.7, 4.1};
		
		System.out.println(arrayReais(teste, 0));
		
		int[] numeros = {1, 2, 3, 4, 5};
		imprimir(numeros);
		inverterArray(numeros, 0, numeros.length-1);
		imprimir(numeros);
		
		System.out.println(binario(13));
	}
	
	public static int expoenteN(int x, int n) {
		if(n ==  1) return x;
		else return x * expoenteN(x, n -1);
	}
	
	public static double arrayReais(double[] array, int indice) {
		if(indice == array.length) return 0;
		return array[indice] + arrayReais(array, indice + 1);
	}
	
	public static void inverterArray(int[] array, int inicio, int fim) {
		
		if(inicio >= fim) return;
		
		int temp = array[inicio];
		array[inicio] = array[fim];
		array[fim] = temp;
		
		inverterArray(array, inicio + 1, fim -1);
	}
	
	public static void imprimir(int[] array) {
		System.out.print("|");
        for (int num : array) {
            System.out.print(num + "|");
        }
        System.out.println();
    }
	
	public static String binario(int num) {
		if(num == 0) return "";
		else return binario(num /2) + (num%2);
		
	}

}
