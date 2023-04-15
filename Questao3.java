import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		int numero;
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tabuada");
        
		System.out.println("");
        
        System.out.print("Digite um numero: ");
        numero = scan.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero * i);
        }
        
        scan.close();

	}

}