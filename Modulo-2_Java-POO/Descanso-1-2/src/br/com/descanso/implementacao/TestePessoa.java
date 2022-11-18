package br.com.descanso.implementacao;

import javax.swing.JOptionPane;

import br.com.descanso.beans.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa(
				JOptionPane.showInputDialog("Digite o nome"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"))
				);
		
		
		System.out.println(pessoa);
		
		
	}

}
