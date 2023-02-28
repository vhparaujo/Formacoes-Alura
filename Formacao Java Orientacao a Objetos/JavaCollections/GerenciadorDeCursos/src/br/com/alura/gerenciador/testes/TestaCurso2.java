package br.com.alura.gerenciador.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.gerenciador.modelo.Aula;
import br.com.alura.gerenciador.modelo.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Java Collections avancado", "Paulo Silveira");

		List<Aula> aulasImutaveis = javaColecoes.getAulas();

		System.out.println(aulasImutaveis);

		// javaColecoes.getAulas().add(new Aula("Revisando as lista", 21));
		javaColecoes.adiciona("Revisando as lista", 21);
		javaColecoes.adiciona("Listas de Objetos e seus metodos", 17);
		javaColecoes.adiciona("Melhorando o conhecimento em listas", 20);

		System.out.println(aulasImutaveis);

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);

		Collections.sort(aulas);
		System.out.println(aulas);

		System.out.println("Tempo total do curso e de: " + javaColecoes.getTempoTotal() + " minutos");

		System.out.println(javaColecoes);

	}
}
