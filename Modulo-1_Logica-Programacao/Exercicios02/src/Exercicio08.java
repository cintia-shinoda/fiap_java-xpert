import java.util.Scanner;

public class Exercicio08 {

	/*
	8 – Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a média. 
	Faça um programa onde o professor informe a média e as notas de cada um dos 50 alunos e, 
	ao final, seja exibido quantos alunos tiveram nota superior à média e quantos tiveram nota inferior à média.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double nota, media;
		int totalSuperior=0, totalInferior=0, i=0;
		
		
		System.out.println("Informe a média de notas dessa turma: ");
		media = scan.nextDouble();
		
		while (i < 50) {
			System.out.println("Informe a nota do " + (i+1) + "˚ aluno");
			nota = scan.nextDouble();
			
			if(nota  >= media) {
				totalSuperior = totalSuperior + 1;
			} else {
				totalInferior = totalInferior + 1;
			}
			
			i++;
			
		}
		
		System.out.println("Média: " + media);
		System.out.println("Alunos com nota superior ou igual à média: " + totalSuperior);
		System.out.println("Alunos com nota inferior à média: " + totalInferior);
		
		scan.close();
	}
	
}
