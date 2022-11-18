import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Um robô de combate só deve ativar sua arma principal quando o inimigo está a menos de 70cm de distância. 
		// Faça um programa onde o usuário informe a distância do inimigo 
		// e sejam exibidas as mensagens “ATIVADO” ou “DESATIVADO” dependendo do status da arma.
		
		Scanner scan = new Scanner(System.in);
		
		double distancia;
		
		System.out.println("Informe a distância do inimigo em centímetros");
		distancia = scan.nextDouble();
		
		if (distancia < 70) {
			System.out.println("ATIVADO");
		} else {
			System.out.println("DESATIVADO");
		}
		
		scan.close();
		
	}

}
