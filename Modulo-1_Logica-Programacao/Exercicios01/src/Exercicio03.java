import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e B. 
		// Sem usar uma terceira variável, troque os valores de A e B entre si.

		Scanner scan = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite o valor de A");
		A = scan.nextInt();
		System.out.println("Digite o valor de B");
		B = scan.nextInt();
		
		A = A + B;
		B = A - B;
		A = A - B;
		
		System.out.println("Agora, o valor da variável A é: " + A);
		System.out.println("Agora, o valor da variável B é: " + B);
		
		
		scan.close();
		
	}

}
