package br.com.renbstux.Modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		if (valor < 0) {
			System.out.println("O Valor precisa ser Positivo!");
			return;
		}
		super.saldo += valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ContaPoupanca" + super.toString();
	}
}
