import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		// Scanner = classe capaz de ler fluxo de dados digitados pelo usuário
		Scanner leitor = new Scanner(System.in);
		
		// criação de uma variável (espaço na memória) para guardarmos um dado
		String nomeUsuario;
		
		System.out.println("Por favor, escreva seu nome:");
		
		// lê o texto digitado pelo usuário
		nomeUsuario = leitor.next();
		
		System.out.println("Obrigada por utilizar o programa, " + nomeUsuario);
		
		// libera o Scanner após o uso
		leitor.close();
	}

}
