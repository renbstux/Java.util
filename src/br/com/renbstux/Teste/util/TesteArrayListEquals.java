package br.com.renbstux.Teste.util;

import java.util.ArrayList;

import br.com.renbstux.Modelo.Conta;
import br.com.renbstux.Modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 11);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(22, 12);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 12);
		boolean existe = lista.contains(cc3);
		
		System.out.println("já existe? " + existe);
		
		lista.forEach((conta) -> System.out.println(conta));
//		//Para cada elemento do tipo Object desta lista, queremos que seja impresso o seu valor:
//		for(Conta conta : lista) {
//			System.out.println(conta);
//		}
		

	}

}
