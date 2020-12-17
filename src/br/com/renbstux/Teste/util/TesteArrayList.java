package br.com.renbstux.Teste.util;

import java.util.ArrayList;

import br.com.renbstux.Modelo.Conta;
import br.com.renbstux.Modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(22, 12);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(22, 13);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(22, 14);
		lista.add(cc4);
		
		for(int i=0; i< lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("---------------------");
		
		lista.forEach((conta) -> System.out.println(conta));
		//Para cada elemento do tipo Object desta lista, queremos que seja impresso o seu valor:
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		

	}

}
