package br.com.Vbank.banco.modelos;

/**
 * Classe representa um cliente do Vbank.
 * 
 * @author Victor Hugo
 * @version 0.1
 *
 */
public class Cliente {
	private String nome;
	private String profissao;
	private String cpf;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome2) {
		this.nome = nome2;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setProfissao(String profissao2) {
		this.profissao = profissao2;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public void setCPF(String novoCPF) {
		this.cpf = novoCPF;
	}
	
}