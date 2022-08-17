public class FluxoComTratamento {
	
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch(Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception: " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	public static void metodo1() throws MinhaExcecao {
		System.out.println("Inicio do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	public static void metodo2() throws MinhaExcecao { //checked
		System.out.println("Inicio do metodo 2");
		
		throw new MinhaExcecao("Fiz minha excecao");
		
		/*ArithmeticException exc = new ArithmeticException("Excecao Arithmetic Exception detectada");
		throw exc;*/
		
		//System.out.println("Fim do metodo 2");
	}
	
}
