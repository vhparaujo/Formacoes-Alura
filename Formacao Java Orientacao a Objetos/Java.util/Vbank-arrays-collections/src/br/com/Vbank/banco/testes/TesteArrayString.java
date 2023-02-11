package br.com.Vbank.banco.testes;

public class TesteArrayString {
	
	// teste do array de String - serve para passar parametros no terminal
	public static void main(String[] args) {
		
		System.out.println("Funcionou");

		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
	}
	
}
