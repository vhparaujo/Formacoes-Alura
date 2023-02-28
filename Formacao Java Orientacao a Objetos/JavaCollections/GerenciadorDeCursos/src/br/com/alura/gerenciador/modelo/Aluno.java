package br.com.alura.gerenciador.modelo;

import java.util.Objects;

public class Aluno {
	
	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		if(nome == null) {
			throw new NullPointerException("Nome nulo");
		}
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
//	// equals() simples
//	@Override
//	public boolean equals(Object obj) {
//		Aluno outroAluno = (Aluno) obj; // cast
//		return this.nome.equals(outroAluno.nome);
//	}
//	
//	// hashCode() simples
//	// caso seja sobrescrito equals(), obrigatoriamente se sebrescreve hashCode()
//	@Override
//	public int hashCode() {
//		return this.nome.hashCode();
//	}
	
	// implementacao automatica do Eclipse, recomendado
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}

	// implementacao automatica do Eclipse, recomendado
	// caso seja sobrescrito equals(), obrigatoriamente se sebrescreve hashCode()
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	@Override
	public String toString() {
		return "{Aluno: " + nome + ", Matricula: " + matricula + "}";
	}
	
}
