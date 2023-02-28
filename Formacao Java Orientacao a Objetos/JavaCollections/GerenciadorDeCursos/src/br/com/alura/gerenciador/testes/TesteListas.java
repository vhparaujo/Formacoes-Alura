package br.com.alura.gerenciador.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class TesteListas {

	public static void main(String[] args) {

		String aula1 = "Melhorando o conhecimento em listas";
		String aula2 = "Trabalhando em cima das classes da plataforma";
		String aula3 = "Implementando cursos e sets";
		String aula4 = "Aumentando nossa capacidade";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		// diferentes fors para uso em uma lista
		
		for(String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		aulas.remove(0);
		
		System.out.println("-----------------");

		aulas.forEach((sentencas) -> {
			System.out.println("Percorrendo aula: " );
			System.out.println(sentencas);
		});
		
		// testando metodos da Lista
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula e: " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula : " + aulas.get(i));
		}
		
		Collections.sort(aulas);
		System.out.println(aulas);
			
	}
}
