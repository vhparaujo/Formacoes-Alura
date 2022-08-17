
public class Desafio {
	public static void main(String[] args) {
			
		for(int multiplicador = 1; multiplicador < 100; multiplicador++) {
			int multiplo = multiplicador * 3;
			System.out.println(multiplo);
			if(multiplo >= 100 - 3) {
				break;
			}
		}
	}
}