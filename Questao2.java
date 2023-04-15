
public class Questao2 {

	public static void main(String[] args) {
		
		int numero = 1001;
		int contador = 0;

		System.out.println("O quinto numero maior que 1000, cuja divisão por 11 tenha resto 5");
		
		System.out.println("");
		
		while (contador < 5) {
			if (numero % 11 == 5) {
				contador++;
				if (contador == 5) {
					System.out.println("O numero e: " + numero);
				}
			}
			
			numero++;
		}

	}

}