package br.com.Vbank.banco.testes;

public class TesteArraysPrimitivos {

	public static void main(String[] args) {
		
		//int[] idades = new int[5]; // inicializa o array com os valores padrao do tipo
		int[] idades = {19,20,14,58,44}; // forma literal de declaracao, ja passando os valores
		
		/*idades[0] = 19;
		idades[1] = 20;
		idades[2] = 14;
		idades[3] = 58;
		idades[4] = 44;*/
		int idade1  = idades[0];
		
		System.out.println("Valor que se encontra na primeira posição = " + idade1);
		
		System.out.println("Tamanho do array = " + idades.length);
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	
	}

}
