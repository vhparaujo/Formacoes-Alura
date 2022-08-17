
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.Saldo = 200;
		System.out.println(primeiraConta.Saldo); //200
		
		primeiraConta.Saldo += 100;
		System.out.println(primeiraConta.Saldo); //300
		
		Conta segundaConta = new Conta();
		segundaConta.Saldo = 50;
		
		System.out.println("A primeira conta tem " + primeiraConta.Saldo); //300
		System.out.println("A segunda conta tem " + segundaConta.Saldo); //50
		
		System.out.println(primeiraConta.Agencia); //0
		System.out.println(primeiraConta.Numero); //0
		
		if(primeiraConta == segundaConta) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}