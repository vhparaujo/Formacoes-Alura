
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDoJovem = new Conta();
		System.out.println(contaDoJovem.getSaldo());
		
		contaDoJovem.Titular = new Cliente();
		System.out.println(contaDoJovem.Titular);
		
		contaDoJovem.Titular.nome = "Suarez";
		System.out.println(contaDoJovem.Titular.nome);
	}

}