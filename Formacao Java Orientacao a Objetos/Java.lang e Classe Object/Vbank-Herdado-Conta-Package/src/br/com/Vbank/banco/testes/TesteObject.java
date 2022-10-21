package br.com.Vbank.banco.testes;

import br.com.Vbank.banco.modelos.Cliente;
import br.com.Vbank.banco.modelos.Conta;
import br.com.Vbank.banco.modelos.ContaCorrente;
import br.com.Vbank.banco.modelos.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(125, 555);
		// A classe Object e a classe mais generica do Java, todas a extendem.
		// Object cc = new ContaCorrente(125, 555);
		Conta cp = new ContaPoupanca(1225, 6985);
		// Object cp = new ContaPoupanca(1225, 6985);
		Cliente cliente = new Cliente();
		// Object cliente = new Cliente();
		
		cc.deposita(500);
		cp.deposita(250);
		
		cliente.setNome("Victor");
		System.out.println("Cliente: " + cliente.getNome() + "\n  " + cc);
		
		cliente.setNome("Suarez");
		System.out.println("Cliente: " + cliente.getNome() + "\n  " + cp);
		
		// teste de uso do metodo criado
		println(cliente);

	}
	
	// testes de sobrecarga de um metodo
	public static void println(int i) {}
	public static void println(boolean b) {}
	public static void println(String s) {}
	public static void println(Object o) {}
	
}
