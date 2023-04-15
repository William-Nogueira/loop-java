import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {

		int codigo;
		int senha;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Digite o codigo do usuario: ");
			codigo = scan.nextInt();
			
			System.out.print("Digite a senha do usuário: ");
			senha = scan.nextInt();
			
			if (codigo == senha) {
				System.out.println("Erro. Repita as informacoes.");
				
			} else {
				System.out.println("Aprovado.");
				scan.close();
				break;
				
			}
		}
	}
}