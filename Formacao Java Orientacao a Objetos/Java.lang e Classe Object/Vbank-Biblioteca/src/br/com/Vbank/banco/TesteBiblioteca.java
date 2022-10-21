package br.com.Vbank.banco;

import br.com.Vbank.banco.modelos.Conta;
import br.com.Vbank.banco.modelos.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		
		c.deposita(500);
		
		System.out.println(c.getSaldo());
		
	}

}
