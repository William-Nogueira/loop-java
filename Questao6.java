import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {

		int numero1;
		int numero2;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		numero1 = scan.nextInt();

		System.out.print("Digite o segundo numero: ");
		numero2 = scan.nextInt();

		System.out.println("Os numeros entre " + numero1 + " e " + numero2 + " sao: ");
		
		for (int i = numero1 + 1; i < numero2; i++) {
			System.out.println(i);
		}

		scan.close();

	}

}