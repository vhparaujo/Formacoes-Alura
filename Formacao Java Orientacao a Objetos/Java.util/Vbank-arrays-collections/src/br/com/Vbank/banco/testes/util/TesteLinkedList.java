package br.com.Vbank.banco.testes.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.Vbank.banco.modelos.Cliente;
import br.com.Vbank.banco.modelos.Conta;
import br.com.Vbank.banco.modelos.ContaCorrente;
import br.com.Vbank.banco.modelos.ContaPoupanca;

public class TesteLinkedList {

	public static void main(String[] args) {
		
		// classe LinkedList do pacote java.util, com Generics <>, que especifica o tipo do LinkedList
		// LinkedList, outra estrutura de lista, nao eh um array, eh uma lista duplamente encadeada
		List<Conta> lista = new LinkedList<Conta>();
        // List<Conta> lista = new Vector<Conta>(); //usa array por baixo, mas tbm é threadsafe
		// Vector<>() permite e execucao de pilhas em paralelo
		
		List<Cliente> nomes = new LinkedList<Cliente>();
		
		Conta cc = new ContaCorrente(22, 11);
		// metodo add(), da classe LinkedList, inclui um objeto na lista 
		lista.add(cc);
				
		Conta cc2 = new ContaCorrente(22, 25);
		lista.add(cc2);
			
		Conta cp = new ContaPoupanca(47, 58);
		lista.add(cp);
		
		Cliente cliente = new Cliente();
		nomes.add(cliente);
		cliente.setNome("Victor");
		
		Cliente cliente2 = new Cliente();
		nomes.add(cliente2);
		cliente2.setNome("Messi");
		
		// metodo size(), retorna quantas posicoes estao preenchidas na lista
		System.out.println("Posicoes preenchidas no array = " + lista.size());
		
		// metodo get(), retorna o elemento daquela posicao informada
		// com generics nao e preciso fazer o cast
		Conta ref = lista.get(2);
		System.out.println(ref);
		
		// remove(), remove o elemento da posicao informada
		lista.remove(2);
		System.out.println("Posicoes preenchidas no array = " + lista.size());
		
		System.out.println("-----------------");
		
		// for para acessar todos os elementos da lista
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("-----------------");
		
		// for each para acessar todos os elementos da lista, mais utilizado
		for(Conta contas : lista) {
			System.out.println(contas);
		}
		
		System.out.println("-----------------");
		
		// enhanced for para acessar todos os elementos da lista, mais utilizado
		for(Cliente clientes : nomes) {
			System.out.println(clientes);
		}
		
		// teste de parametros do LinkedList
		LinkedList<String> estados = new LinkedList<>();
		
		estados.add("DF");
		estados.add("RJ");
		estados.add("SP");
		estados.add("MG");
		
		LinkedList<List> nova = new LinkedList(estados);
		
		System.out.println(nova);
		nova.add(estados);
		System.out.println(nova);
		
	}

}
