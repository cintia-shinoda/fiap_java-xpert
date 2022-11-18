import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*Antes da pandemia, o rodízio na cidade de São Paulo foi motivo de confusão em uma empresa: muitos dos 150 colaboradores estão se atrasando e alegando que o problema foi o horário do rodízio. 
		 * Cansado disso, um dos diretores da empresa solicitou um programa que receba o NOME de cada um dos funcionários, o SETOR desses profissionais e o meio de transporte usado (CARRO ou ÔNIBUS).
		 * Caso o profissional use um CARRO para ir até a empresa, deve ser solicitada a digitação do último dígito numérico da placa do carro e a mensagem exibida deve ser: “Seu dia de rodízio é “ seguida do dia de rodízio.
Caso o profissional use um ÔNIBUS para ir até a empresa, deve ser exibida a mensagem “rodízio não se aplica”.*/

		
		String nomeFuncionario, setor;
		int meioTransporte, digitoPlaca;
		
		Scanner leitor = new Scanner(System.in);
		
		for (int i=1; i<= 2; i++) {
			System.out.println("Digite o nome do " + i + "º funcionário");
			nomeFuncionario = leitor.next();
			System.out.println("Informe o setor do " + i + "º funcionário");
			setor = leitor.next();
			System.out.println("Informe seu meio de transporte: 1 - para CARRO e 2 - para ÔNIBUS");
			meioTransporte = leitor.nextInt();
		
		
			if (meioTransporte == 1) {
				System.out.println("Digite o último dígito numérico da placa:");
				digitoPlaca = leitor.nextInt();
				
					switch(digitoPlaca) {
					case 1:
					case 2:
						System.out.println("Atenção, " + nomeFuncionario + " do setor "+ setor + ", seu dia de rodízio é SEGUNDA-FEIRA");
						break;
					case 3:
					case 4:
						System.out.println("Atenção, " + nomeFuncionario + " do setor "+ setor + ", seu dia de rodízio é TERÇA-FEIRA");
						break;
					case 5:
					case 6:
						System.out.println("Atenção, " + nomeFuncionario + " do setor "+ setor + ", seu dia de rodízio é QUARTA-FEIRA");
						break;
					case 7:
					case 8:
						System.out.println("Atenção, " + nomeFuncionario + " do setor "+ setor + ", seu dia de rodízio é QUINTA-FEIRA");
						break;
					case 9:
					case 0:
						System.out.println("Atenção, " + nomeFuncionario + " do setor "+ setor + ", seu dia de rodízio é SEXTA-FEIRA");
						break;
					}
			} else {
				if(meioTransporte == 2) {
					System.out.println("Atenção, " + nomeFuncionario + " do setor "+ setor + ", o rodízio municipal não se aplica");
				
				} else {
					System.out.println("Meio de transporte inválido");
				}
				
			}
		}
		leitor.close();
	}
}
		
