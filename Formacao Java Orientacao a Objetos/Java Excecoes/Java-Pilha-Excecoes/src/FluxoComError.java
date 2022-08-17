public class FluxoComError {
	
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception: " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	public static void metodo1() {
		System.out.println("Inicio do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	public static void metodo2() {
		System.out.println("Inicio do metodo 2");
		metodo2();
		System.out.println("Fim do metodo 2");
	}
	
}
