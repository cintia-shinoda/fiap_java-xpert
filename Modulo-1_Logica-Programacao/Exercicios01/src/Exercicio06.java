import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom “DIADEFESTA”. 
		// Faça um programa onde o funcionário digite o valor da compra e um cupom, 
		// informando o valor final a ser pago.

		Scanner scan = new Scanner(System.in);
		
		String cupom;
		double valorCompra, valorFinal;
		
		System.out.println("Digite o valor da compra");
		valorCompra = scan.nextDouble();
		System.out.println("Digite o cupom");
		cupom = scan.next();
		
		if (cupom.equals("DIADEFESTA")) {
			valorFinal = valorCompra * 0.97;
		} else {
			valorFinal = valorCompra;
		}
		
		System.out.println("O valor a ser pago é R$ " + valorFinal);
		
		scan.close();
	}

}
