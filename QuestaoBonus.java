import java.util.Scanner;

public class QuestaoBonus {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		int soma = 0;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		numero1 = scan.nextInt();

		System.out.print("Digite o segundo numero: ");
		numero2 = scan.nextInt();

		System.out.println("Os numeros entre " + numero1 + " e " + numero2 + " sao: ");
		
		for (int i = numero1 + 1; i < numero2; i++) {
			System.out.println(i);
			soma += i;
		}

        System.out.println("A soma dos numeros e: " + soma);
		
		scan.close();

	}

}