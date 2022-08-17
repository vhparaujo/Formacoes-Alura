public class testeFuncionario {

	public static void main(String[] args) {
		
		Gerente victor = new Gerente();
		victor.setNome("Victor Hugo Pacheco Araujo");
		victor.setCpf("255954638-21");
		victor.setSalario(5000.00);
		
		
		System.out.println(victor.getNome());
		System.out.println(victor.getCpf());
		System.out.println(victor.getSalario());
		System.out.println(victor.getBonificacao());
		
		
		//victor.salario = 600; 
	}
	
}