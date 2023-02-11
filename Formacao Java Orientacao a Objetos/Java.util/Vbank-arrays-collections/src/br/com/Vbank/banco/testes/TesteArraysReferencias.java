package br.com.Vbank.banco.testes;

import br.com.Vbank.banco.modelos.Cliente;
import br.com.Vbank.banco.modelos.Conta;
import br.com.Vbank.banco.modelos.ContaCorrente;
import br.com.Vbank.banco.modelos.ContaPoupanca;

public class TesteArraysReferencias {
	
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5]; // pelo tipo ser objeto, inicializa-se null
		//Object[] referencias = new Object[5]; // tipo mais generico possivel
		
		ContaCorrente cc1 = new ContaCorrente(5544, 252525);
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(8877, 269686);
		contas[1] = cc2;
		
		/*Cliente cliente = new Cliente();
		contas[2] = cliente;*/ // poderia usar no caso mais generico
		
		contas[0].deposita(100);
		
		System.out.println("Numero da conta: " + contas[1].getNumero());
		System.out.println("Saldo da conta: " + contas[0].getSaldo());
		
		ContaPoupanca ref = (ContaPoupanca) contas[1]; // type cast ou casting, troca do tipo mais generico para mais especifico
		System.out.println(ref.getNumero()); // equivale a System.out.println(cc1.getNumero());
		
	}
	
}
