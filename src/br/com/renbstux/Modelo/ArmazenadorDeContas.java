package br.com.renbstux.Modelo;

public class ArmazenadorDeContas {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public ArmazenadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getTamanhoArray() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		// TODO Auto-generated method stub
		return this.referencias[pos];
	}

}
