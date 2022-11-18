package br.com.lojaabc.implementacao;

import br.com.lojaabc.lib.Magica;
import br.com.lojaabc.modelo.PessoaFisica;
import br.com.lojaabc.modelo.PessoaJuridica;

public class ImplementarCliente {

	public static void main(String[] args) {
		
		/*
		 * O usuário vai escolher entre uma pessoa Física ou Jurídica
		 * Dependendo da escolha dele, você vai instanciar o objeto, preencher os dados via construtor cheio  e exibir em seguida
		 */
		

		
		char resposta  = Magica.s("Digite F ou J").charAt(0);
		if (resposta =='F') {
			PessoaFisica pf = new PessoaFisica(
					"nome PF",
					"email PF",
					"fone PF",
					"cpf PF",
					"rg PF"
					);
			System.out.println(pf.toString());
			
		} else if (resposta == 'J') {
			PessoaJuridica pj = new PessoaJuridica (
					"nome PJ",
					"email PJ",
					"fone PJ",
					"cnpj PJ",
					"cnae PJ"
					);
			System.out.println(pj.toString());
		
		} else {
			System.out.println("Opção inválida");
		}
				
				
		
		
		
		
		
		
		
		
		

	}

}
