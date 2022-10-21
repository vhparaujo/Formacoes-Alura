package br.com.Vbank.banco.modelos;

public class SeguroDeVida implements Tributavel {
	
	@Override
	public double getValorImposto() {
		
		return 10; 
	}

}