package br.com.descanso.implementacao;

import javax.swing.JOptionPane;

import br.com.descanso.beans.Aluno;


public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(
				Double.parseDouble(JOptionPane.showInputDialog("Digite a Média Semestral 1")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a Média Semestral 2")),
				JOptionPane.showInputDialog("Digite o nome do aluno"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número de faltas"))
		);
		
		
		
		
		
		System.out.println(aluno);

	}

}
