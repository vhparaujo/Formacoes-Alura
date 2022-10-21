package br.com.Vbank.banco.modelos;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SacaException{
		double valorSacado = valor + 0.2;
		super.saca(valorSacado);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor; 
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente - " + super.toString();
	}

}
