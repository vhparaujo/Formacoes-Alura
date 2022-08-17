public class Fiscal implements Autenticavel {
	
	public double getImposto(){
		return 1000;
	}
	
	private AutenticadorPadrao autenticador; 
	
	public Fiscal() {
		this.autenticador = new AutenticadorPadrao();
	}
	
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}