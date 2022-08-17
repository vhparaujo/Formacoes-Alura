
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoVictor = new Conta();
		contaDoVictor.Saldo = 100; 
		contaDoVictor.deposita(50);
		
		System.out.println(contaDoVictor.Saldo); //150
		
		boolean retorno = contaDoVictor.saca(50);
		System.out.println(contaDoVictor.Saldo);
		System.out.println(retorno);	

		Conta contaDoJovem = new Conta(); 
		contaDoJovem.deposita(1000);
		
		if(contaDoJovem.transfere(500, contaDoVictor)) {
			
			System.out.println("Transferência feita com sucesso!!");
		} else {
			
			System.out.println("Saldo insuficiente!!");
		}
			
		System.out.println(contaDoJovem.Saldo);
		System.out.println(contaDoVictor.Saldo);
	}
}