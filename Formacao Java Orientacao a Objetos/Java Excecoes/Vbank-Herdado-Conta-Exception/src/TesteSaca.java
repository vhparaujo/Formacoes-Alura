
public class TesteSaca {
	
	public static void main(String[] args) {
		
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(500);
		try {
			conta.saca(600);
		} catch(SacaException ex) {
			System.out.println(ex.getMessage());
		}
		 
		System.out.println(conta.getSaldo());
	}

}
