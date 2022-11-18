import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
	// Para um ano de nascimento fornecido pelo usuário, informe a idade que ele terá no dia 31 de dezembro de 2021.
	
		Scanner scan = new Scanner(System.in);
		
		int anoNascimento, idade;

		System.out.println("Informe o ano de nascimento");
		anoNascimento = scan.nextInt();
		
		idade = 2021 - anoNascimento;
		System.out.println("A idade, em 31 de Dezembro de 2021, será " + idade + " anos");
		
		scan.close();
	}

}
