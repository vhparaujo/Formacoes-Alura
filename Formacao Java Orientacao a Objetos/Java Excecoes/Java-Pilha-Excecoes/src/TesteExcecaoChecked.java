
public class TesteExcecaoChecked {

	public static void main(String[] args) {
		
		Teste t = new Teste();
		try {
			t.metodo();
		} catch(MinhaExcecao ex) {
			System.out.println("Tratamento...");
		}

	}

}
