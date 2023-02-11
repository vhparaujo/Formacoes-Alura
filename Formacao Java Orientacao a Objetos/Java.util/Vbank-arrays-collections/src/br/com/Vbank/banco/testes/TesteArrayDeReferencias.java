package br.com.Vbank.banco.testes;

import br.com.Vbank.banco.modelos.ArrayDeReferencias;
import br.com.Vbank.banco.modelos.Cliente;
import br.com.Vbank.banco.modelos.Conta;
import br.com.Vbank.banco.modelos.ContaCorrente;
import br.com.Vbank.banco.modelos.ContaPoupanca;

// classe para teste de array de referencias criado em outra classe
public class TesteArrayDeReferencias {
	
	public static void main(String[] args) {
		
		//referencia para o array
		ArrayDeReferencias guardador = new ArrayDeReferencias();
		
		Conta cc = new ContaCorrente(22, 11);
		// metodo adiciona, inclui um objeto no array
		guardador.adiciona(cc);
		System.out.println(cc);
		
		Conta cc2 = new ContaCorrente(22, 25);
		guardador.adiciona(cc2);
		System.out.println(cc2);
		
		Conta cp = new ContaPoupanca(47, 58);
		guardador.adiciona(cp);
		System.out.println(cp);
		
		Cliente cliente = new Cliente();
		guardador.adiciona(cliente);
		cliente.setNome("Victor");
		System.out.println(cliente.getNome());
		
		// metodo getTamanho, retorna quantas posicoes foram preenchidas
		int tamanho = guardador.getTamanho();
		System.out.println("Tem " + tamanho + " posicoes do array utilizadas.");
		
		// getReferencia, retorna o objeto em si
		Conta ref = (Conta) guardador.getReferencia(2);
		System.out.println(ref);
		
		/*
		for (int i = 0; i < guardador.getTamanho(); i++) {
			Conta ref = (Conta) guardador.getReferencia(i);
            System.out.println(ref);
        }
		*/
		
	}

}
