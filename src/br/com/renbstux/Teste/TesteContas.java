package br.com.renbstux.Teste;

import br.com.renbstux.Modelo.ContaCorrente;
import br.com.renbstux.Modelo.ContaPoupanca;
import br.com.renbstux.Modelo.SacaException;

public class TesteContas {

	public static void main(String[] args) throws SacaException{
		ContaCorrente cc = new ContaCorrente(111, 112);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 223);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());

	}

}
