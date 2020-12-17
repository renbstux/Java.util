package br.com.renbstux.Teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {

	public static void main(String[] args) {
		Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
        
        String diaComoTexto = "29";
        System.out.println(Integer.parseInt(diaComoTexto));
        
        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); //unboxing
        
        Double dRef = Double.valueOf(3.2); //autoboxing
        System.out.println(dRef.doubleValue()); //unboxing
        
        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());
        
        Number refNumero = Double.valueOf(29.9);
        
        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(15.9f);
        

	}

}
