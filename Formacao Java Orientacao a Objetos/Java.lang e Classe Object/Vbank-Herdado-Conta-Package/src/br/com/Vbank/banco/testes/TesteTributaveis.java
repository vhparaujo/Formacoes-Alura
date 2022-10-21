package br.com.Vbank.banco.testes;
import br.com.Vbank.banco.modelos.CalculadorDeImposto;
import br.com.Vbank.banco.modelos.ContaCorrente;
import br.com.Vbank.banco.modelos.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 4545);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		
		CalculadorDeImposto ci = new CalculadorDeImposto();
		ci.registra(cc);
		ci.registra(seguro);
		
		System.out.println(ci.getTotalImposto());
		
	}
	
}