
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(8227, 123456);
		
		conta.deposita(-100);
		System.out.println(conta.getSaldo());
		
		Conta contaDois = new Conta(5555, 1235878);
		
		System.out.println("Total de contas: " + Conta.getTotal());
		

		//conta.setNumero(-66);
		//conta.setAgencia(-55);
		//System.out.println(conta.getAgencia());
		//System.out.println(conta.getNumero());
	}
}