import java.util.Scanner;

public class EntendendoLoopWhile {

	public static void main(String[] args) {
		/* Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média? */
	
	/*		
		Scanner leitor = new Scanner(System.in);
		
		int idade1, idade2, idade3, idade4, idade5;
		double media;
		
		System.out.println("Informe a idade do primeiro aluno");
		idade1 = leitor.nextInt();
		
		System.out.println("Informe a idade do segundo aluno");
		idade2 = leitor.nextInt();
		
		System.out.println("Informe a idade do terceiro aluno");
		idade3 = leitor.nextInt();
		
		System.out.println("Informe a idade do quarto aluno");
		idade4 = leitor.nextInt();
		
		System.out.println("Informe a idade do quinto aluno");
		idade5 = leitor.nextInt();
		
		media = (idade1 + idade2 + idade3 + idade4 + idade5) / 5.0;
		
		System.out.println("A média das idades é " + media);
		leitor.close();
	 */
	
		
		
	/*
	 	Scanner leitor = new Scanner(System.in);
	 	
		int idade;
		double media=0;
		
		System.out.println("Informe a idade do primeiro aluno");
		idade = leitor.nextInt();
		media = media + idade;
		
		System.out.println("Informe a idade do segundo aluno");
		idade = leitor.nextInt();
		media = media + idade;
		
		System.out.println("Informe a idade do terceiro aluno");
		idade = leitor.nextInt();
		media = media + idade;
		
		System.out.println("Informe a idade do quarto aluno");
		idade = leitor.nextInt();
		media = media + idade;
		
		System.out.println("Informe a idade do quinto aluno");
		idade = leitor.nextInt();
		media = media + idade;
		
		media = media / 5.0;
		
		leitor.close();
		
	 */
		
		
		int idade;
		double media = 0;
		int quantidadeAlunos = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		while(quantidadeAlunos < 5) {
			System.out.println("Informe a idade do " + (quantidadeAlunos + 1) + "˚ aluno");
			idade = leitor.nextInt();
			media = media + idade;
			quantidadeAlunos = quantidadeAlunos + 1;
			// quantidadeAlunos = += 1;
			// quantidadeAlunos++
		}
		
		media = media / 5.0;
		
		System.out.println("A média das idade é " + media);
		
		leitor.close();
		
	}

}
