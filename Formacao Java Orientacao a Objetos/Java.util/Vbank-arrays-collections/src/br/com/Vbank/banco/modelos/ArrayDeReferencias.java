package br.com.Vbank.banco.modelos;

public class ArrayDeReferencias {
	
	private Object[] referencias;
	private int posicaoGuardada;
	
	public ArrayDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoGuardada = 0;
	}
	
	// metodo adiciona, inclui um objeto no array
	public void adiciona(Object ref) {
		this.referencias[this.posicaoGuardada] = ref;
		this.posicaoGuardada++;
	}
	
	// metodo getTamanho, retorna quantas posicoes foram preenchidas
	public int getTamanho() {
		return this.posicaoGuardada;
	}

	// getReferencia, retorna o objeto em si
	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}
