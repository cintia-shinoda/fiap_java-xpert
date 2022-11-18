package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Curso;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Professor;
import br.com.fiap.beans.Turma;

public class ImplementarTurma {

	public static void main(String[] args) {
		Turma turma = new Turma(
				1,
				"JX",
				"noite",
				new Curso(
					2,
					"desc curso",
					200,
					5000,
					"Especial"
				),
				new Aluno(
						3,
						"Nome Aluno",
						"aluno@fiap.com.br",
						"1234-0987",
						new Endereco(
								"logradouro",
								"complemento",
								"numero",
								"bairro",
								"cidade",
								"uf",
								"cep"
								)
						),
				new Professor(
						new Endereco(
								"logradouro",
								"complemento",
								"numero",
								"bairro",
								"cidade",
								"uf",
								"cep"
								),
						"prof",
						"forma",
						3000
						)
				);
		
		System.out.println("Nome do professor: " + turma.getProfessor().getNome());
		System.out.println("Nome do aluno: " + turma.getAluno().getNome());
		System.out.println("Logradouro do aluno: " + turma.getAluno().getEndereco().getLogradouro());
		System.out.println("Valor do curso: " + turma.getCurso().getValor());
		

	}

}
