package br.com.alura.gerenciador.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		// Set (conjunto) nao garante a ordem de insercao
		// Set nao permite elementos repetidos
		// a grande vantagem dos conjuntos (Set) é a velocidade
		// Collection<String> alunos = new HashSet<>();
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Victor Hugo");
		alunos.add("Suarez");
		alunos.add("Leonardo");
		alunos.add("Leticia");
		alunos.add("Leticia"); // elemento repetido, nao e inserido
		
		// alunos.get(0);  nao existe em Set
		// Collections.sort(alunos);  nao funciona em Set
		
		for(String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.remove("Suarez"); // nao aceita indice em Set
		
		System.out.println(alunos.size());		
		System.out.println(alunos);
		
		System.out.println(alunos.contains("Victor Hugo"));
		
		alunos.forEach((aluno) -> System.out.println(aluno));
		
		// posso colocar Conjuntos dentro de uma Lista para poder ordenar
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		Collections.sort(alunosEmLista);
		System.out.println(alunosEmLista);
		
		System.out.println(alunosEmLista.get(2));
		
	}

}
