package br.com.Vbank.banco.testes;
import br.com.Vbank.banco.modelos.ContaCorrente;
import br.com.Vbank.banco.modelos.ContaPoupanca;
import br.com.Vbank.banco.modelos.SacaException;
import br.com.Vbank.banco.modelos.especial.ContaEspecial;

public class TesteContas {

	public static void main(String[] args) throws SacaException{
		
		// teste do protected
		ContaEspecial ce = new ContaEspecial(154, 8854);
		//ce.saldo; 

		ContaCorrente cc = new ContaCorrente(123, 8227);
		cc.deposita(500);
		
		ContaPoupanca cp = new ContaPoupanca(321, 3357);
		cp.deposita(100);
		
		cc.transfere(600, cp);

		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());
		
	}

}
