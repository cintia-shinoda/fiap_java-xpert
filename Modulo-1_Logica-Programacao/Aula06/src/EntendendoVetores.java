import java.util.Scanner;

public class EntendendoVetores {
	
	// Se for necessário aceitar mais ou menos entradas, mude o valor abaixo
	public static final int TAMANHO = 10;
	
	public static void main(String[] args) {
		int vetor[] = new int[TAMANHO];  // cria um vetor
		
		// vetor[0] = 5;
		// vetor[1] = 10;

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("O tamanho do vetor é " + vetor.length);
		
		for (int i=0; i<vetor.length; i++) {
			System.out.println("Digite um valor");
			vetor[i] = leitor.nextInt();
		}
		
		for (int i=0; i<vetor.length; i++) {
			System.out.println("No índice " + i + " foi armazenado o valor " + vetor[i]);
		}
		
		leitor.close();
	}
}
