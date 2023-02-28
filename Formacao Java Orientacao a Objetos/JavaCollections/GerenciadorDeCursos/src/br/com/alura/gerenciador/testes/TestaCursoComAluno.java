package br.com.alura.gerenciador.testes;

import java.util.Iterator;
import java.util.Set;

import br.com.alura.gerenciador.modelo.Aluno;
import br.com.alura.gerenciador.modelo.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaCurso = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaCurso.adiciona("Trabalhando com ArrayList", 21);
		javaCurso.adiciona("Criando uma Aula", 20);
		javaCurso.adiciona("Modelando com coleções", 24);

		Aluno a1 = new Aluno("Victor", 1234);
		Aluno a2 = new Aluno("Lele", 4321);
		Aluno a3 = new Aluno("Hugo", 5946);
		Aluno a4 = new Aluno("Carla", 4257);

		javaCurso.matricula(a1);
		javaCurso.matricula(a2);
		javaCurso.matricula(a3);
		javaCurso.matricula(a4);

		// nao consigo adicionar por getAlunos() ser unmodifiableSet
//		Set<Aluno> alunos = javaCurso.getAlunos();
//		alunos.add(new Aluno("VictorHUgo" , 98799));

		System.out.println("Todos os alunos matriculados no curso: " + javaCurso.getNome());
		// forEach(), forma atual do for, desde o java 8
//		javaCurso.getAlunos().forEach(
//				aluno -> System.out.println(aluno));

		// for para acessar os elementos antes do java 8
//		for (Aluno a : javaCurso.getAlunos()) {
//			System.out.println(a);
//		}

		// codigo legado, deprecated. Forma antiga de iterar conjuntos, listas, etc
		Set<Aluno> alunos = javaCurso.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator(); // comeca a lista ou set do zero
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
//		// Collections.emptySet() cria um conjunto vazio, pode ser util 
//		Set<String> cursoVazio = Collections.emptySet();
//		cursoVazio.add("Paulo");

//		// teste de Threads, mais avancado no curso de Threads
//		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(javaCurso.getAlunos());
//		System.out.println(alunosSincronizados);

		System.out.println("O aluno " + a1.getNome() + " esta matriculado? " + javaCurso.estaMatriculado(a1));

		Aluno hugo = new Aluno("Hugo", 5946);
		System.out.println("E esse Hugo, esta matriculado? " + javaCurso.estaMatriculado(hugo));
		System.out.println("O a3 equals hugo? " + a3.equals(hugo));
		
	}

}
