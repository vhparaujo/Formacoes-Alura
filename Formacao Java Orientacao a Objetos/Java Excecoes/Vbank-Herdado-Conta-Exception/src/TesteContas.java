
public class TesteContas {

	public static void main(String[] args) throws SacaException{

		ContaCorrente cc = new ContaCorrente(123, 8227);
		cc.deposita(500);
		
		ContaPoupanca cp = new ContaPoupanca(321, 3357);
		cp.deposita(100);
		
		cc.transfere(600, cp);

		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());
		
	}

}