package br.com.renbstux.Teste;

public class TesteArrayPrimitivos {

	//Array []
	public static void main(String[] args) {
		
		int[] idades = new int [5];
		
		double precos[] = new double [5]; //pode se colocar o colchete [] tanto no tipo da variavel quanto no atributo
		
		idades[0] = 29;
//		
//		System.out.println(idades[0]);
//		
//		System.out.println(idades.length);
		
		for(int i=0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for( int i = 0 ; i < idades.length; i++ ) {
			System.out.println(idades[i]);
		}

	}

}
