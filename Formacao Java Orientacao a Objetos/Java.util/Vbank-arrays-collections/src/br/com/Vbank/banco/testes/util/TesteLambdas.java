package br.com.Vbank.banco.testes.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.Vbank.banco.modelos.Cliente;
import br.com.Vbank.banco.modelos.Conta;
import br.com.Vbank.banco.modelos.ContaCorrente;

public class TesteLambdas {

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
        
        // lambda expressions ->
        lista.sort( (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) );
        
        lista.forEach((conta) -> System.out.println(conta + ", Nome: " + conta.getTitular().getNome()));
        
        // lambda expressions ->
//        Comparator<Conta> comparatorString = (Conta c1, Conta c2) -> {
//        		
//        		String nomeC1 = c1.getTitular().getNome().toUpperCase();
//        		String nomeC2 = c2.getTitular().getNome().toUpperCase();
//        		
//        		return nomeC1.compareTo(nomeC2);
//        	
//        };  
//      lista.sort(comparatorString);
        
        System.out.println("------------");
        
        // lambda expressions ->
        lista.sort((c1, c2) -> {
    		
    		String nomeC1 = c1.getTitular().getNome().toUpperCase();
    		String nomeC2 = c2.getTitular().getNome().toUpperCase();
    		
    		return nomeC1.compareTo(nomeC2);
    	
        	}
        );
        
        // lambda expressions ->
        lista.forEach((conta) -> System.out.println(conta + ", Nome: " + conta.getTitular().getNome()));

	}
}
