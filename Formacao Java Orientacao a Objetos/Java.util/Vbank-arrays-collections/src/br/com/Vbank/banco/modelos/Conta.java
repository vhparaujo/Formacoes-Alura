package br.com.Vbank.banco.modelos;

/**
 * Classe representa uma conta bancaria.
 * 
 * @author Victor Hugo
 * @version 0.1
 *
 */
public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero.
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas � " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        // System.out.println("Estou criando uma conta " + this.numero);
    }

    //abstract nesse metodo somente para praticar o abstract
    public abstract void deposita(double valor);
    
    /**
     * O metodo saca contem uma excecao do tipo SacaException.
     * 
     * @param valor
     * @throws SacaException
     */
    public void saca(double valor) throws SacaException{
        if(this.saldo < valor) {
        	throw new SacaException("Saldo insuficiente! Saldo: " + this.saldo + ", Valor: " + valor);
        } 
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SacaException{
        this.saca(valor);
        destino.deposita(valor);
                
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    
    // metodo equals(), da classe Object, sobrescrito
    @Override
    public boolean equals(Object ref) {
    	
    	Conta contas = (Conta) ref;
    	
    	if(this.agencia != contas.agencia) 
    		return false;
    	
    	if(this.numero != contas.numero)
    		return false;
    	
    	return true;
    }
    
    @Override
    public int compareTo(Conta segundaConta) {
    	
    	return Double.compare(this.saldo, segundaConta.saldo);
    			
    }
    
    @Override
    public String toString() {
    	return "Agencia: " + this.agencia + ", Numero: " + this.numero + ", Saldo: " + this.saldo;
    }

}
