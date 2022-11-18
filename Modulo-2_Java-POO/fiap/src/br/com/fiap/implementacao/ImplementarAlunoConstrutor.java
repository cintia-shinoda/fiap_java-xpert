package br.com.fiap.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Endereco;
import br.com.fiap.lib.Magica;



public class ImplementarAlunoConstrutor {


	

	
	public static void main(String[] args) {
		
		
		// construtor cheio - 1 objeto (Aluno)
		Aluno objeto = new Aluno(
				123,
				"Cintia",
				"cintia.shinoda@me.com",
				"110000000",
				new Endereco(
						"Avenida Paulista",
						"1106",
						"",
						"Bela Vista",
						"São Paulo",
						"SP",
						"12345-678"
						)
		);
		
		
		
		Aluno objeto1 = new Aluno(
				Magica.i("RM"),
				Magica.s("Nome"),
				Magica.s("E-Mail"),
				Magica.s("Fone"),
				new Endereco(
						Magica.s("Logradouro"),
					"1222",
					"",
					"Aclimação",
					"São Paulo",
					"SP",
					"98765-432"
					)
		);
		
		
		JOptionPane.showMessageDialog(null, objeto1.toString());
		
		
		System.out.println(objeto.toString());
		System.out.println(objeto.getEndereco().getBairro());  // retornar somente o bairro
		
	}

}
