package br.com.renbstux.Modelo;

public class ArmazenadorDeReferencias {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	public ArmazenadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getTamanhoArray() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		// TODO Auto-generated method stub
		return this.referencias[pos];
	}

}
