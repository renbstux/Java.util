package br.com.renbstux.Teste;

import br.com.renbstux.Modelo.CalculadorDeImposto;
import br.com.renbstux.Modelo.ContaCorrente;
import br.com.renbstux.Modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto imposto = new CalculadorDeImposto();
		imposto.registra(cc);
		imposto.registra(seguro);
		
		System.out.println(imposto.getTotalImposto());

	}

}
