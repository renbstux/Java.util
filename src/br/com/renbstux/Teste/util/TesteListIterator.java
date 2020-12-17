package br.com.renbstux.Teste.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteListIterator {

	public static void main(String[] args) {
		//List
//		List<String> nomes = new ArrayList<String>();
//		nomes.add("Super Mario");
//		nomes.add("Yoshi"); 
//		nomes.add("Donkey Kong"); 
//
//		Iterator<String> it = nomes.iterator();
//
//		while(it.hasNext()) {
//		  System.out.println(it.next());
//		}
		//Set
		Set<String> nomes = new HashSet<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
	}
}
