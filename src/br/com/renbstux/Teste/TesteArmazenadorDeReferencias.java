package br.com.renbstux.Teste;

import br.com.renbstux.Modelo.ArmazenadorDeReferencias;
import br.com.renbstux.Modelo.Conta;
import br.com.renbstux.Modelo.ContaCorrente;

public class TesteArmazenadorDeReferencias {

	public static void main(String[] args) {


		ArmazenadorDeReferencias armazena = new ArmazenadorDeReferencias();
		
		Conta cc1 = new ContaCorrente(22, 11);
		armazena.adiciona(cc1);
		
		Conta cc2 = new ContaCorrente(22, 12);
		armazena.adiciona(cc2);
		
		int tamanho = armazena.getTamanhoArray();
		System.out.println(tamanho);
		
		Conta ref = (Conta) armazena.getReferencia(1);
		System.out.println(ref.getNumero());
			
	}	

}
