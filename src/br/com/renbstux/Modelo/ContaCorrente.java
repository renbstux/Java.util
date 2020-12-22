package br.com.renbstux.Modelo;

// new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SacaException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
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
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ContaCorrente" + super.toString();
	}
}
