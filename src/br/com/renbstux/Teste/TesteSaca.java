package br.com.renbstux.Teste;

import br.com.renbstux.Modelo.Conta;
import br.com.renbstux.Modelo.ContaCorrente;
import br.com.renbstux.Modelo.SacaException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		Conta c = new ContaCorrente(-111, 222);

		conta.deposita(200);
		c.deposita(1000);

		try {
			conta.saca(210);
		} catch (SacaException e) {
			// TODO Auto-generated catch block
			System.out.println("Ex: " + e.getMessage());
		}

		System.out.println(conta.getSaldo());

	}

}
