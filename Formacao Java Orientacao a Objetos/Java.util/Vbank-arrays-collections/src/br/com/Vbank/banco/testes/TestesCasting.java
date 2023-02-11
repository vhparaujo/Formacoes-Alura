package br.com.Vbank.banco.testes;

import br.com.Vbank.banco.modelos.Cliente;

public class TestesCasting {
	
	public static void main(String[] args) {
		
		//Caso interessante para exemplificar o casting e tipos de referencia 
	
		Cliente clienteNormal = new Cliente();
		clienteNormal.setNome("Flavio");

		Cliente clienteVip = new Cliente();
		clienteVip.setNome("Romulo");

		Object[] refs = new Object[5];
		refs[0]  = clienteNormal;
		refs[1]  = clienteVip;

		System.out.println(((Cliente) refs[1]).getNome());
		
		// mais testes de cast
		int n1 = 3;
		double v1 = n1; //cast implícito
		
		int n = 3;
		double v = (double) n; //cast explícito
		
		double valor = 3.56;
		int numero = (int) valor; //cast explicito é exigido pelo compilador
	}

}
