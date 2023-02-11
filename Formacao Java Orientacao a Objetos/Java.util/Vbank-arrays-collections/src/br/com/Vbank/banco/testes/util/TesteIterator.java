package br.com.Vbank.banco.testes.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import br.com.Vbank.banco.modelos.Cliente;
import br.com.Vbank.banco.modelos.Conta;
import br.com.Vbank.banco.modelos.ContaCorrente;

public class TesteIterator {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 10);
		cc1.deposita(2000);
		
		Conta cc2 = new ContaCorrente(22, 40);
		cc2.deposita(1000);
		
		Conta cc3 = new ContaCorrente(22, 30);
		cc3.deposita(4000);
		
		Conta cc4 = new ContaCorrente(22, 20);
		cc4.deposita(3000);
		
        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        Iterator<Conta> conta = lista.iterator();
        
        while(conta.hasNext()) {
        	System.out.println(conta.next());
        }
        	
        Set<String> nomes = new HashSet<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi"); 
        nomes.add("Donkey Kong"); 

        Iterator<String> nome = nomes.iterator();

        while(nome.hasNext()) {
          System.out.println(nome.next());
        }
        
	}
}
