package br.com.renbstux.Teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.renbstux.Modelo.ContaCorrente;

public class TesteDeserializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, ClassCastException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(cc.getSaldo());
		System.out.println(cc.getTitular().getNome());

	}

}
