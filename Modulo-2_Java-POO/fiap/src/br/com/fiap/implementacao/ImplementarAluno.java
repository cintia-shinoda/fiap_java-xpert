package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Endereco;

public class ImplementarAluno {

	public static void main(String[] args) {
		
		Aluno objeto = new Aluno();
		objeto.setNome("Cintia");
		objeto.setEmail("cintia.shinoda@me.com");
		objeto.setFone("91239123");
		objeto.setRm(123);
		
		
		System.out.println(objeto.getNome());
		System.out.println(objeto.getEmail());
		System.out.println(objeto.getFone());
		System.out.println(objeto.getRm());
		
		
		
		
		
		
		
		
		// Construtor vazio - 2 objetos (Aluno e Endereco)
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Avenida Paulista");
		endereco.setNumero("1106");
		endereco.setBairro("Bela Vista");
		endereco.setCidade("São Paulo");
		endereco.setUf("SP");
		endereco.setCep("12345-000");
		
		
/*
		Aluno objeto2 = new Aluno();
		
			objeto2.setAll(
				456,
				"Izumi",
				"cintia.shinoda@mac.com",
				"1194948474",
				endereco);
		
		System.out.println(objeto2.toString());
		
*/		
		
		
	}

}
