package br.com.Vbank.banco.testes;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Victor Hugo"; // sintaxe -> Objeto Literal
		// String outro = new String("Alura");
		// A classe String tb e um objeto, mas nao e preciso usar o new
		
		/* A clase String uma vez instaciada seu objeto, ela e imutavel, nao pode ser alterada
		   nome.replace("V", "v");
		System.out.println(nome); */
		
		// charAt retorna o char daquela posicao informada
		char c = nome.charAt(3);
		System.out.println("Caracter da posicao 3 = " + c);
		
		//indexOf retorna a posicao do caracter informado
		int posicao = nome.indexOf("or");
		System.out.println("Posicao de 'or': " + posicao);
		
		String sub = nome.substring(2, 7);
		System.out.println("Substring da posicao 2 a 7: " + sub);
		//System.out.println(nome.substring(2, 7));
		
		String outro = nome.replace("Vic", "vIC");
		System.out.println(outro);
		
		System.out.println("Tamanho da string: " + nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
		    System.out.println(nome.charAt(i));
		}
		
		String vazio = " testando espaco vazio ";
		//o metodo trim() tira os espacos de uma string no inicio e no final somente
		String espacoVazio = vazio.trim();
		System.out.println("Esta vazio? " + espacoVazio.isEmpty());
		System.out.println(vazio.trim());
		
		// o metodo contains diz se tem a substring informada na string a qual se refere
		System.out.println(nome.contains("Hu"));
		
		// StringBuilder e uma classe que ajuda a concatenar strings e 
		// tb implementa a interface CharSequence 
		String palavra = "ALURA";
		CharSequence cs = new StringBuilder("al");
		palavra = palavra.replace("AL", cs);
		System.out.println(palavra); 
		
	}

}