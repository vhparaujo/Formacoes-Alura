
public class TestaEscopo {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais ");
		
		int idade = 16;
		int quantidadePessoas = 1;
		
		//boolean acompanhado = quantidadePessoas >= 1; 
		
		boolean acompanhado;
		
		if(quantidadePessoas >= 1) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar!");		
		}
	}
}