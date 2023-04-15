import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		int numero = 1;
		int soma = 0;
		int produto = 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("Multiplica os numeros impares e soma os numeros pares");
		
		System.out.println("");
		
		while (numero > 0) {
			System.out.print("Digite um numero: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) {
				soma += numero;
				
			} else {
				produto *= numero;
			}

			System.out.println("Soma: " + soma);
			System.out.println("Produto: " + produto);

		}
		
		scan.close();
	}

}