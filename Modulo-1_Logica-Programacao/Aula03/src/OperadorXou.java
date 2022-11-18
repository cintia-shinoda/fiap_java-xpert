import java.util.Scanner;

public class OperadorXou {

	public static void main(String[] args) {
		/* Em uma ONG há uma horta monitorada e automatizada por um Arduino.
		 * Escreva o código de um programa que receba a umidade relativa do ar e a temperatura atual. 
		 * Caso a umidade seja maior que 70% ou caso o temperatura seja maior que 26C, exibir a mensagem "ligando os ventiladores". Caso as duas condições sejam verdadeiras ou falsas, exibir a mensagem: "Entrar em contato com agrônomo". */
		
		Scanner leitor =  new Scanner(System.in);
		Double umidade, temperatura;
		System.out.println("Por favor, insira a umidade relativa do ar:");
		umidade = leitor.nextDouble();
		System.out.println("Por favor, insira a temperatura em graus Celsius: ");
		temperatura = leitor.nextDouble();
		

		/*
		* V e F ou F e V -> V
		* F e F ou V e V -> F
		*/
		
		if (umidade > 70 ^ temperatura > 26) {
			System.out.println("Ligar os ventiladores");
		} else {
			System.out.println("Entrar em contato com agrônomo");
		}
		
		
		leitor.close();
		

	}

}
