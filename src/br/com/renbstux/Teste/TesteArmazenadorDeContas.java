package br.com.renbstux.Teste;

import br.com.renbstux.Modelo.ArmazenadorDeContas;
import br.com.renbstux.Modelo.Conta;
import br.com.renbstux.Modelo.ContaCorrente;

public class TesteArmazenadorDeContas {

	public static void main(String[] args) {


		ArmazenadorDeContas armazena = new ArmazenadorDeContas();
		
		Conta cc1 = new ContaCorrente(22, 11);
		armazena.adiciona(cc1);
		
		Conta cc2 = new ContaCorrente(22, 12);
		armazena.adiciona(cc2);
		
		int tamanho = armazena.getTamanhoArray();
		System.out.println(tamanho);
		
		Conta ref = armazena.getReferencia(1);
		System.out.println(ref.getNumero());
			
	}	

}
