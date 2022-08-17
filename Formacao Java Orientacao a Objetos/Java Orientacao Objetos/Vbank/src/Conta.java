
public class Conta {	
	double Saldo;
	int Agencia;
	int Numero;
	String Titular;
	
	public void deposita(double valor) {
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

}