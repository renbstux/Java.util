package br.com.renbstux.Teste;

import br.com.renbstux.Modelo.Conta;
import br.com.renbstux.Modelo.ContaCorrente;
import br.com.renbstux.Modelo.ContaPoupanca;

public class TesteArrayReferencia {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(123, 12);
		ContaCorrente cc2 = new ContaCorrente(123, 13);
		ContaCorrente cc3 = new ContaCorrente(123, 14);
		ContaCorrente cc4 = new ContaCorrente(123, 15);
		ContaPoupanca cc5 = new ContaPoupanca(123, 110);
		
		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cc3;
		contas[3] = cc4;
		contas[4] = cc5;
		
		contas[3].deposita(500);
		contas[4].deposita(6000);
		
		ContaPoupanca ref = (ContaPoupanca) contas[4]; //type CAST
		
		System.out.println(contas[2].getNumero());
		System.out.println(contas[3].getSaldo());
		System.out.println(contas[4].getSaldo());
		int[] refs = {1,2,3,4,5};
		
		

	}

}
