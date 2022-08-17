
public class TestaReferencia {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.Saldo = 300;
		System.out.println("Primeira conta tem: " + primeiraConta.Saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(segundaConta.Saldo);
		
		segundaConta.Saldo += 100;
		System.out.println(segundaConta.Saldo);
		
		System.out.println(primeiraConta.Saldo);
		
		if(segundaConta == primeiraConta) {
			System.out.println("sao iguais");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}