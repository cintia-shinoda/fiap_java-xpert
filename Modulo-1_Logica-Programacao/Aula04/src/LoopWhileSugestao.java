import java.util.Scanner;

public class LoopWhileSugestao {

	public static void main(String[] args) {
		/* Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média? */
		
		Scanner leitor = new Scanner(System.in);
		
		int idade=0;
		double media = 0;
		int quantidadeAlunos = 0;
		String continuar = "sim";
		
		while(continuar.equals("sim")) {
			System.out.println("Informe a idade do " + (quantidadeAlunos + 1) + "˚ aluno");
			idade = leitor.nextInt();
			media = media + idade;
			quantidadeAlunos += 1;
			System.out.println("Digite sim para informar outro aluno ou não para realizar o cálculo da média com os dados informados");
			continuar = leitor.next();
		}
		
		media = media / (double) quantidadeAlunos;
		
		System.out.println("A média das idade é " + media);
		
		leitor.close();
	}

}
