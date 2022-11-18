import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Receba um número inteiro do usuário e calcule e exiba a tabuada deste número
		
		
		int numero, resultado;
		Scanner leitor = new Scanner(System.in);
		System.out.println(" Informe um número inteiro");
		numero = leitor.nextInt();
		
		for(int i=1; i<=10; i++) {
			resultado = numero * i;
			System.out.println(numero + " x " + i +  " = " + resultado);
		}
		
		leitor.close();

	}

}
