
public class Conta {	
	private double Saldo;
	private int Agencia;
	private int Numero;
	private Cliente Titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é: " + Conta.total);
		this.Agencia = agencia;
		this.Numero = numero; 
		System.out.println("Conta criada; Ag�ncia: " + agencia + " ; " + "N�mero: " + numero);
		
	}
	// para nao haver duplica�oes em construtores usa-se this() entre eles para isso!!
	
	public void deposita(double valor) {
		if(valor <= 0) {
			System.out.println("N�o � poss�vel depositar.");
			return;
		}
		this.Saldo += valor;
	}
	
	public boolean saca(double valor) {
		
		if(this.Saldo >= valor) {
			this.Saldo -= valor;
			return true;
		} 
			return false;
	}	
	
	public boolean transfere(double valor, Conta destino) {
		
		if(this.Saldo >= valor) {
			this.Saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
			return false; 
	}
	
	public double getSaldo() {
		return this.Saldo;
	}
	
	public int getNumero() {
		return this.Numero;
	}
	
	public void setNumero(int novoNumero) {
		if(novoNumero <= 0) {
			System.out.println("N�o � poss�vel n�meros com valores iguais ou menores que 0.");
			return;
		}
		this.Numero = novoNumero;
		
	}
	
	public int getAgencia() {
		return this.Agencia;
	}
	
	public void setAgencia(int novaAgencia) {
		if(novaAgencia <= 0) {
			System.out.println("N�o � poss�vel ag�ncias com valores iguais ou menores que 0.");
			return;
		}
		this.Agencia = novaAgencia;
	}
	
	public Cliente getTitular() {
		return this.Titular;
	}
	
	public void setTitular(Cliente titular) {
		this.Titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}