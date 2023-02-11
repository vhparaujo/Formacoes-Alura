package br.com.Vbank.banco.testes.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.Vbank.banco.modelos.Cliente;
import br.com.Vbank.banco.modelos.Conta;
import br.com.Vbank.banco.modelos.ContaCorrente;

public class TesteSortComparatorEComparable {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 10);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Victor");
		cc1.setTitular(clienteCC1);
		cc1.deposita(2000);
		
		Conta cc2 = new ContaCorrente(22, 40);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Suarez");
		cc2.setTitular(clienteCC2);
		cc2.deposita(1000);
		
		Conta cc3 = new ContaCorrente(22, 30);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Messi");
		cc3.setTitular(clienteCC3);
		cc3.deposita(4000);
		
		Conta cc4 = new ContaCorrente(22, 20);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("CR7");
		cc4.setTitular(clienteCC4);
		cc4.deposita(3000);
		
        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        for (Conta conta : lista) {
			System.out.println(conta + ", Nome: " + conta.getTitular().getNome());
		}
        
        //lista.sort(new TitularDaContaComparator());
        lista.sort(null); // ordem natural da interface comparator
        
        //Collections.sort(lista, new NumeroDaContaComparator());
        //Collections.reverse(lista);
        //Collections.sort(lista); // ordem natural, usando a interface comparable e seu metodo compareTo()
        //Collections.shuffle(lista); // embaralha a lista de forma randomica
        //Collections.rotate(lista, 0); // rotaciona os elementos da lista

        System.out.println("--------------");
        
        for (Conta conta : lista) {
			System.out.println(conta + ", Nome: " + conta.getTitular().getNome());
		}
		
	}

}

class TitularDaContaComparator implements Comparator<Conta>{
	
	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome().toUpperCase();
		String nomeC2 = c2.getTitular().getNome().toUpperCase();
		
		return nomeC1.compareTo(nomeC2);
	}
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		// primeira forma de comparacao
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
		// segunda forma de comparacao, usando logica matematica
//		return c1.getNumero() - c2.getNumero();
 		
		// terceira forma de comparacao
//		if(c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		
//		if(c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		
//		return 0;
	}
	
}
