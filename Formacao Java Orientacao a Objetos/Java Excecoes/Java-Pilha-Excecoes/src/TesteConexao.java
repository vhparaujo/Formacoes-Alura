
public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Erro de excecao!!!!");
		}
		
		// modo antigo, antes da versao 1.7
		/*
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch(IllegalStateException ex){
			System.out.println("Erro de excecao!!!!");
		} finally { // bloco sempre executado, independentemente da excecao ser lancada ou nao
			if(con != null) {
				con.close();
			}
		}
		*/
		
	}
}
