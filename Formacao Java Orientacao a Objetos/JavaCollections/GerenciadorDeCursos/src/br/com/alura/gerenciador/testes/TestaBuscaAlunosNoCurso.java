package br.com.alura.gerenciador.testes;

import java.util.NoSuchElementException;

import br.com.alura.gerenciador.modelo.Aluno;
import br.com.alura.gerenciador.modelo.Curso;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaCurso = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaCurso.adiciona("Trabalhando com ArrayList", 21);
		javaCurso.adiciona("Criando uma Aula", 20);
		javaCurso.adiciona("Modelando com colecoes", 24);

		Aluno a1 = new Aluno("Victor", 1234);
		Aluno a2 = new Aluno("Lele", 4321);
		Aluno a3 = new Aluno("Hugo", 5946);
		Aluno a4 = new Aluno("Carla", 4257);
		Aluno a5 = new Aluno("Suarez", 5946);

		javaCurso.matricula(a1);
		javaCurso.matricula(a2);
		javaCurso.matricula(a3);
		javaCurso.matricula(a4);
		javaCurso.matricula(a5);
		
		System.out.println(javaCurso.getAlunos());
		
		System.out.println("Quem e o aluno com matricula 5946? ");
		try {
			Aluno aluno = javaCurso.buscaMatriculado(5946);
			System.out.println(aluno.getNome());
			// E mostrado suarez, porque foi esquecido o aluno anterior de mesma matricula e mantido so o ultimo
		}catch(NoSuchElementException semElemento) {
			System.out.println("Matricula nao encontrada.");
		}		
		
	}

}
