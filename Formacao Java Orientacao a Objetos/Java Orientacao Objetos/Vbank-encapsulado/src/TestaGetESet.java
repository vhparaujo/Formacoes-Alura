
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(8227, 123456);
		conta.setNumero(123);
		System.out.println(conta.getNumero());
		
		conta.setAgencia(2525);
		System.out.println(conta.getAgencia());
		
		Cliente victor = new Cliente();
		conta.setTitular(victor);
		victor.setNome("Victor Hugo");
		victor.setCPF("123456789");
		
		//victor.setProfissao("Programador");
		//conta.getTitular().setProfissao("Programador");
		Cliente irineu = conta.getTitular();     // 3 maneiras diferentes de escrever o mesmo codigo!
		irineu.setProfissao("Programador");
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCPF());
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(victor);
		System.out.println(conta.getTitular());
		System.out.println(irineu);

	}
}