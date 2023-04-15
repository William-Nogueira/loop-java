import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

		int numero;
		int numFormula = 1;
		int i = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Verifica se um numero e triangular");
		
		System.out.println("");
		
		System.out.print("Digite um numero: ");
		numero = scan.nextInt();

		while (numFormula < numero) {
			i++;
			numFormula = i * (i + 1) * (i + 2);
		}

		if (numFormula == numero) {
			System.out.println("O numero " + numero + " e triangular");
			
		} else {
			System.out.println("O numero " + numero + " nao e triangular");
		}

		scan.close();

	}

}