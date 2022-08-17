public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch(Exception ex) { // Nao e boa pratica ser generico usando Exception assim
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
	
	public static void metodo2() throws MinhaExcecao {
		System.out.println("Inicio do metodo 2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			//int a = i / 0;
			Teste t = null;
			t.metodo();
		}
		System.out.println("Fim do metodo 2");
	}
	
}
