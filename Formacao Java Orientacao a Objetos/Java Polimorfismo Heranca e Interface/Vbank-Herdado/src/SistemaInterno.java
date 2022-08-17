
public class SistemaInterno {

	public int senha = 1234;
	
	public void autentica(Autenticavel a) {
		boolean autenticou = a.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema!");
        } else {
            System.out.println("Nao pode entrar no sistema!");
        }
		
	}
	
}