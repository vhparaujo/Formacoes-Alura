package br.com.alura.gerenciador.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteShuffle {

	public static void main(String[] args) {
		// testando o shuffle()
		List<Integer> numeros = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			numeros.add(i);
		}

		Collections.shuffle(numeros);
		System.out.println(numeros);

	}

}
