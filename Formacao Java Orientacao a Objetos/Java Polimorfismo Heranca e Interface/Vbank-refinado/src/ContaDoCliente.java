
public class ContaDoCliente {
	
	public static void main(String[] args) {
		Cliente victor = new Cliente();
		victor.nome = "Victor Hugo";
		victor.cpf = "123.456.789-12";
		victor.profissao = "Programador";
		
		Conta contaDoVictor = new Conta();
		contaDoVictor.deposita(100);
		
		contaDoVictor.Titular = victor;
		System.out.println(contaDoVictor.Titular.nome);
		System.out.println(contaDoVictor.Titular.cpf);
		System.out.println(contaDoVictor.Titular.profissao);
		System.out.println(contaDoVictor.Titular);
	}

}