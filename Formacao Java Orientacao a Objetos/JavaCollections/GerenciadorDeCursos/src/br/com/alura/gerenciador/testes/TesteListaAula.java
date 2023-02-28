package br.com.alura.gerenciador.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.gerenciador.modelo.Aula;

public class TesteListaAula {
	
	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Revisando as listas", 15);
		Aula aula2 = new Aula("Listas de Objetos e seus metodos", 17);
		Aula aula3 = new Aula("Melhorando o conhecimento em listas", 20);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		// precisa sobrescrever o toString()
		// antes da comparacao
		System.out.println(aulas);
		
		// 3 opcoes de comparacao pelo titulo
		Collections.sort(aulas);
		//Collections.sort(aulas, Comparator.comparing(Aula::getTitulo));
		//aulas.sort((s1, s2) -> s1.getTitulo().compareTo(s2.getTitulo()));
		
		// depois da comparacao
		System.out.println("Comparando pelo titulo da aula: ");
		System.out.println(aulas);
		
		// 3 opcoes de comparacao pelo tempo
		//Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		//aulas.sort((a1, a2) -> Integer.compare(a1.getTempo(), a2.getTempo()));
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		// comparando pelo tempo
		System.out.println("Comparando pelo tempo da aula: ");
		System.out.println(aulas);
		
	}

}
