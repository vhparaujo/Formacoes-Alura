package br.com.Vbank.banco.testes.util;

import java.util.ArrayList;

import br.com.Vbank.banco.modelos.Cliente;
import br.com.Vbank.banco.modelos.Conta;
import br.com.Vbank.banco.modelos.ContaCorrente;
import br.com.Vbank.banco.modelos.ContaPoupanca;

public class TesteArrayListGenerics {

	public static void main(String[] args) {
		
		// classe ArrayList do pacote java.util, com Generics <>, que especifica o tipo do ArrayList
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ArrayList<Cliente> nomes = new ArrayList<Cliente>();
		
		Conta cc = new ContaCorrente(22, 11);
		// metodo add(), da classe ArrayList, inclui um objeto no array 
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
		
		// metodo size(), retorna quantas posicoes estao preenchidas no array
		System.out.println("Posicoes preenchidas no array = " + lista.size());
		
		// metodo get(), retorna o elemento daquela posicao informada
		// com generics nao e preciso fazer o cast
		Conta ref = lista.get(1);
		System.out.println(ref);
		
		// remove(), remove o elemento da posicao informada
		lista.remove(2);
		System.out.println("Posicoes preenchidas no array = " + lista.size());
		
		System.out.println("-----------------");
		
		// for para acessar todos os elementos do array
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("-----------------");
		
		// for each para acessar todos os elementos do array, mais utilizado
		for(Conta contas : lista) {
			System.out.println(contas);
		}
		
		System.out.println("-----------------");
		
		// enhanced for para acessar todos os elementos do array, mais utilizado
		for(Cliente clientes : nomes) {
			System.out.println(clientes);
		}
		
		// teste de parametros do ArrayList
		ArrayList estados = new ArrayList(26);
		
		estados.add("DF");
		estados.add("RJ");
		estados.add("SP");
		estados.add("MG");
		
		ArrayList nova = new ArrayList(estados);
		
		System.out.println(nova);
		nova.add(estados);
		System.out.println(nova);
		
	}

}
