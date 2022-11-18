import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos, 
		// solicite ao usuário que digite o tempo de um filme em minutos e 
		// informe a duração desse filme em horas e em segundos.

		Scanner scan = new Scanner(System.in);
		
		double duracaoMinutos, duracaoHoras, duracaoSegundos;
		
		System.out.println("Informe a duração do filme em minutos");
		duracaoMinutos = scan.nextDouble();
		
		duracaoHoras = duracaoMinutos / 60;
		duracaoSegundos = duracaoMinutos * 60;
		
		// Para exibirmos nosso resultado considerando apenas 2 casas decimais, podemos utilizar o DecimalFormat 
		// (É necessário importar java.text.DecimalFormat;). 
		// Com ele podemos definir a formatação do número desejado. 
		// Indicando #.00, por exemplo, todos os números da parte inteira serão exibidos, mas apenas dois números da parte decimal
		DecimalFormat formatador = new DecimalFormat("#.00");
		
		System.out.println("A duração do filme em horas é: " + formatador.format(duracaoHoras) + " horas");
		System.out.println("A duração do filme em segundos é: " + formatador.format(duracaoSegundos) + " segundos");
		
		
		scan.close();
	}

}
