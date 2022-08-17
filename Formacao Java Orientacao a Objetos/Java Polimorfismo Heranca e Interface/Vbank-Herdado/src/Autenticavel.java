//contrato autenticavel.
	//quem assinar esse contrato precisa implementar.
		//metodo setSenha
		//metodo autentica

public abstract interface Autenticavel {

    public void setSenha(int senha);

    public boolean autentica(int senha);
    
}