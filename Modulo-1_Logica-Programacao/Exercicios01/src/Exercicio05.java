import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. 
		// Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar qual deles deve ser carregado pelo drone.

		Scanner scan = new Scanner(System.in);
		
		double lixo1, lixo2, lixo3;
		
		System.out.println("Informe o peso do lixo 1");
		lixo1 = scan.nextDouble();
		System.out.println("Informe o peso do lixo 2");
		lixo2 = scan.nextDouble();
		System.out.println("Informe o peso do lixo 3");
		lixo3 = scan.nextDouble();
		
		if (lixo1 < lixo2 && lixo1 < lixo3) {
			System.out.println("O primeiro lixo informado, pesando " + lixo1 + "kg é o mais leve e será recolhido pelo drone");
		} else {
			if (lixo2 < lixo1 && lixo2 < lixo3) {
				System.out.println("O segundo lixo informado, pesando " + lixo2 + "kg é o mais leve e será recolhido pelo drone");
			} else {
				if (lixo3 < lixo1 && lixo3 < lixo2) {
					System.out.println("O terceiro lixo informado, pesando " + lixo3 + "kg é o mais leve e será recolhido pelo drone");
				} else {
					System.out.println("Existem resíduos coom pesos iguais. Enviando mensagem para a equipe técnica");
				}
			}
		}
		
		
		scan.close();
		
	}

}
