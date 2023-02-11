package br.com.Vbank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29; // Integer
		
		//Integer idadeRef = new Integer(30); // deprecated
		Integer idadeRef = Integer.valueOf(30); // autoboxing
		// valueOf(), retorna a instancia Integer representando o int
		int valor = idadeRef.intValue(); // unboxing
		// intValue() retorna o valor Integer como um int
		System.out.println(valor);
		
		System.out.println("Maximo valor do Integer: " + Integer.MAX_VALUE);
		System.out.println("Minimo valor do Integer: " + Integer.MIN_VALUE);
		System.out.println("Tamanho em bits do Integer: " + Integer.SIZE);
		System.out.println("Tamanho em bytes do Integer: " + Integer.BYTES);

		String s = args[0]; 
		//Integer numero = Integer.valueOf(s); // parsing a partir de referencia
		int numero = Integer.parseInt(s); // parsing direto
		System.out.println("Valor transformado de String para Integer: " + numero); // parsing
		
		//System.out.println(((Object)numero).getClass().getSimpleName()); // serve para saber o tipo do dado 
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(29); // Autoboxing, transformacao automatica de primitivo em objeto e Unboxing, de objeto para primitivo		
		System.out.println("Valor dentro da lista: " + numeros);
		
		/*
		Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
        // no fim imprime 4
        */

	}

}
