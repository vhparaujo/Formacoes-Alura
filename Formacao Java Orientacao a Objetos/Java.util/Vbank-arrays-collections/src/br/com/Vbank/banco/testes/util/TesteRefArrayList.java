package br.com.Vbank.banco.testes.util;

import java.util.ArrayList;

import br.com.Vbank.banco.modelos.Cliente;
import br.com.Vbank.banco.modelos.Conta;
import br.com.Vbank.banco.modelos.ContaCorrente;
import br.com.Vbank.banco.modelos.ContaPoupanca;

public class TesteRefArrayList {

	public static void main(String[] args) {
	
		// classe ArrayList do pacote java.util 
		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(22, 11);
		// metodo add(), da classe ArrayList, inclui um objeto no array 
		lista.add(cc);
		System.out.println(cc);
		
		Conta cc2 = new ContaCorrente(22, 25);
		lista.add(cc2);
		System.out.println(cc2);
		
		Conta cp = new ContaPoupanca(47, 58);
		lista.add(cp);
		System.out.println(cp);
		
		Cliente cliente = new Cliente();
		lista.add(cliente);
		cliente.setNome("Victor");
		System.out.println(cliente.getNome());
		
		// metodo size(), retorna quantas posicoes estao preenchidas no array
		System.out.println("Posicoes preenchidas no array = " + lista.size());
		
		// metodo get(), retorna o elemento daquela posicao informada
		Conta ref = (Conta) lista.get(1);
		System.out.println(ref);
		
		// remove(), remove o elemento da posicao informada
		lista.remove(3);
		System.out.println("Posicoes preenchidas no array = " + lista.size());
		
		// for para acessar todos os elementos do array
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("-----------------");
		
		// enhanced for para acessar todos os elementos do array, mais utilizado
		for(Object oRefe : lista) {
			System.out.println(oRefe);
		}

	}

}
