package br.com.alura.gerenciador.testes;

import java.util.List;

import br.com.alura.gerenciador.modelo.Aula;
import br.com.alura.gerenciador.modelo.Curso;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Java Collections avancado", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(aulas);
		
		//javaColecoes.getAulas().add(new Aula("Revisando as lista", 21));
		javaColecoes.adiciona("Revisando as lista", 21);
		javaColecoes.adiciona("Listas de Objetos e seus metodos", 17);
		javaColecoes.adiciona("Melhorando o conhecimento em listas", 20);
		
		System.out.println(aulas);

	}
}
