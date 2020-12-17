package br.com.renbstux.Teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = "    Alura    ";
		int a = 3;
		String nome = "Renato";//object literal
		System.out.println(nome.length());
		System.out.println(nome.replace("a", "A"));
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		System.out.println(nome.charAt(2));
		System.out.println(nome.indexOf("ato"));
		System.out.println(nome.substring(1));
		System.out.println(vazio.trim()); //Remove os espaços
		System.out.println(vazio.contains("Alu")); //True or False
	
		for(int i=0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String texto = "Socorram";
		texto = texto.concat("-");
		texto = texto.concat("me");
		texto = texto.concat(", ");
		texto = texto.concat("subi ");
		texto = texto.concat("no ");
		texto = texto.concat("ônibus ");
		texto = texto.concat("em ");
		texto = texto.concat("Marrocos");
		System.out.println(texto); 
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto2 = builder.toString();
		System.out.println(texto2);

	}

}
