package br.com.alura.gerenciador.testes;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("victor", 20);
		Funcionario f2 = new Funcionario("lele", 15);
		Funcionario f3 = new Funcionario("suarez", 22);
		
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdemPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> iterador = funcionarios.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		
	}

}

class Funcionario {

    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    } 

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
    	return nome + " " + idade;
    }
}

class OrdemPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario f, Funcionario f2) {
		return Integer.compare(f.getIdade(), f2.getIdade());
	}
	
}

