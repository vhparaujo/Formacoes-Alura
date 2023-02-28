package br.com.alura.gerenciador.testes;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class TestaPerformance {

	public static void main(String[] args) {
		
		//Set<Integer> numeros = new HashSet<>();
		List<Integer> numeros = new ArrayList<>();

		long inicio1 = System.currentTimeMillis();

		for (int i = 1; i <= 100000; i++) {
			numeros.add(i);
		}
		
		long fim1 = System.currentTimeMillis();
		
		long tempoDeExecucao1 = fim1 - inicio1;
		System.out.println("Tempo gasto adicionando: " + tempoDeExecucao1);

		long inicio2 = System.currentTimeMillis();
		
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fim2 = System.currentTimeMillis();

		long tempoDeExecucao2 = fim2 - inicio2;
		System.out.println("Tempo gasto buscando os elementos: " + tempoDeExecucao2);
		
	}

}
