
public class TesteReferencias {

	public static void main(String[] args) {
	
		Gerente g1 = new Gerente();
		g1.setNome("Victor");
		g1.setSalario(5000.0);
		System.out.println(g1.getNome());
		
		EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);
        
        Designer d = new Designer();
        d.setSalario(500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		
		System.out.println(controle.getSoma());
	}
	
}