import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
	/*
	7 – No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa Javarella. 
	Para isso, devem acertar quantos feijões estão em um jarro (1238). 
	Faça um programa que solicite a digitação da quantidade de feijões até que um cliente acerte.
	 */
		
		int chute=0;
		
		Scanner scan = new Scanner(System.in);
		
		while (chute != 1238) {
			System.out.println("Diga quantos feijões existem no jarro");
			chute = scan.nextInt();
		}
		
		System.out.println("Parabéns! O jarro tinha exatamente 1238 feijões!");
		System.out.println("Você pode passar uma noite no castelo da princesa Javarella");

		scan.close();
	}

}
