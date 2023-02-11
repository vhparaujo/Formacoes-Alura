package br.com.Vbank.banco.testes.util;

import java.util.ArrayList;

import br.com.Vbank.banco.modelos.Cliente;
import br.com.Vbank.banco.modelos.Conta;
import br.com.Vbank.banco.modelos.ContaCorrente;
import br.com.Vbank.banco.modelos.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		/* 
		Conta cc1 = new ContaCorrente(22, 22);
        Conta cc2 = new ContaCorrente(22, 22);

        boolean igual = cc1.ehIgual(cc2);
        System.out.println(igual);*/
		
		// classe ArrayList do pacote java.util, com Generics <>, que especifica o tipo do ArrayList
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		// metodo add(), da classe ArrayList, inclui um objeto no array 
		lista.add(cc);
				
		Conta cc2 = new ContaCorrente(22, 25);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 25);
		
		// foi sobrescrito o metodo equals(), o qual e chamado pelo contains(), por isso cc3 agora existe
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe esse objeto? " + existe);
		
		// for each para acessar todos os elementos do array, mais utilizado
		for(Conta conta : lista) {
		        System.out.println(conta);
		}
		
	}

}
