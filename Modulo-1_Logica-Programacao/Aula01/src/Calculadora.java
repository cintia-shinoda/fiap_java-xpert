import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double primeiroValor;
		double segundoValor;
		// double primeiroValor, segundoValor;
		
		System.out.println("Por favor, digite um valor:");
		primeiroValor = leitor.nextDouble();
		System.out.println("Por favor, digite o segundo valor:");
		segundoValor = leitor.nextDouble();
		
		
		
		
		double soma;
		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores é: " + soma);
		
		double subtracao;
		subtracao = primeiroValor - segundoValor;
		System.out.println("A subtração entre os dois valores é: " + subtracao);
		
		double multiplicacao;
		multiplicacao = primeiroValor * segundoValor;
		System.out.println("A multiplicação entre os dois valores é: " + multiplicacao);
		
		double divisao;
		divisao = primeiroValor / segundoValor;
		System.out.println("A divisão entre os dois valores é: " + divisao);
		
		
		
		
		leitor.close();

	}

}
