
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais ");
		
		int idade = 16;
		int acompanhantes = 1;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos ");
			System.out.println("Seja bem vindo");
		} else {
			if (acompanhantes >= 1) {
				System.out.println("Seja bem vindo");
				System.out.println("Você pode entrar, pois está acompanhado");
			} else {
				System.out.println("Você não pode entrar, pois tem menos de 18 anos e não está acompanhado");
			}
		}
	}
}