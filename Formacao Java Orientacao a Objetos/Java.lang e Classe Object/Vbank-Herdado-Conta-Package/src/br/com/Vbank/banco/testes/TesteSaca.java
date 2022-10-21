package br.com.Vbank.banco.testes;
import br.com.Vbank.banco.modelos.Conta;
import br.com.Vbank.banco.modelos.ContaCorrente;
import br.com.Vbank.banco.modelos.SacaException;

public class TesteSaca {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(500);
		try {
			conta.saca(600);
		} catch(SacaException ex) {
			System.out.println(ex.getMessage());
		}
		 
		System.out.println(conta.getSaldo());
	}

}
