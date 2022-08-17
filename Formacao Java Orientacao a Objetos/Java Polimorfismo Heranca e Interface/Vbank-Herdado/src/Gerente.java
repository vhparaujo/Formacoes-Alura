// gerente é um Funcionario e herda da classe Funcionario os atributos e métodos, e assina o contrato Autenticavel sendo tambem um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticadorPadrao autenticador;

	public Gerente() {
		this.autenticador = new AutenticadorPadrao();
	}
		
	public double getBonificacao() {
		System.out.println("chamou o método de bonificação do gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); 
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}
	
//	public double getBonificacao() {
//	return super.salario * 0.5;                      - Aplicação caso fosse usado o protected. 
//	}
	
}