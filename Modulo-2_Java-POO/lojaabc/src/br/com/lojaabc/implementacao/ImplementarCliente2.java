package br.com.lojaabc.implementacao;

import br.com.lojaabc.lib.Magica;
import br.com.lojaabc.modelo.Cliente;
import br.com.lojaabc.modelo.PessoaFisica;
import br.com.lojaabc.modelo.PessoaJuridica;

public class ImplementarCliente2 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		char resposta  = Magica.s("Digite F ou J").charAt(0);
		if (resposta =='F') {
			cliente = new PessoaFisica(
					"nome PF",
					"email PF",
					"fone PF",
					"cpf PF",
					"rg PF"
					);
		}else if (resposta=='J') {
			cliente = new PessoaJuridica(
					"nome PJ",
					"email PJ",
					"fone PJ",
					"cnpj PJ",
					"cnae PJ"
					);
		}else {
			System.out.println("Opção Inválida");
		}
		
		System.out.println(cliente.toString());
	}

}
