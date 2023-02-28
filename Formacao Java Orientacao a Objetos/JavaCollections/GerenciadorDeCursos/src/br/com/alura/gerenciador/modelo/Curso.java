package br.com.alura.gerenciador.modelo;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new HashSet<>();
	//private Set<Aluno> alunos = new LinkedHashSet<>();
	//private Set<Aluno> alunos = new TreeSet<>();
	private Map<Integer, Aluno> matriculaParaAluno= new HashMap<>();
	// private Map<Integer, Aluno> matriculaParaAluno= new LinkedHashMap<>(); // guarda a ordem de insercao

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	// metodo para retornar a lista de aulas
	public List<Aula> getAulas() {
		// metodo da classe Collections que retorna uma copia da lista que nao pode ser alterada
		return Collections.unmodifiableList(aulas);
	}
	
	// metodo para retornar o conjunto de alunos
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	// metodo para adicionar aulas no curso
	public void adiciona(String aula, int tempo) {
		Aula aulas = new Aula(aula, tempo);
		this.aulas.add(aulas);
	}
	
	// metodo para matricular alunos no curso
	public void matricula(Aluno aluno) {
		// adiciona um aluno no Set de elementos
		this.alunos.add(aluno);
		// cria a relacao entre matricula e aluno no Map
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}

	public int getTempoTotal() {
		// forma avancada, utilizando Java 8
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();

		// forma mais simples
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public Aluno buscaMatriculado(int numeroMatricula) {
		if(!matriculaParaAluno.containsKey(numeroMatricula)) {
			throw new NoSuchElementException();
		}
		return this.matriculaParaAluno.get(numeroMatricula);
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", tempo total: " + getTempoTotal() + " minutos" + ", aulas: " + this.aulas
				+ "]";
	}

}
