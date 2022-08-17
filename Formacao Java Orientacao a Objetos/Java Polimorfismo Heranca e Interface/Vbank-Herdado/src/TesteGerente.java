
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		Gerente gerente1 = new Gerente(); 
		gerente1.setNome("Victor");
		gerente1.setCpf("025894615");
		gerente1.setSalario(5000);
		
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getSalario());
		
		gerente1.setSenha(555);
		boolean autenticar = gerente1.autentica(555);
		System.out.println(autenticar);
		
		System.out.println(gerente1.getBonificacao());

	}
	
}