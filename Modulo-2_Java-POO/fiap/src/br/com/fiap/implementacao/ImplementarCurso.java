package br.com.fiap.implementacao;

import javax.swing.JOptionPane;  // swing = tela

import br.com.fiap.beans.Curso;





public class ImplementarCurso {

	public static void main(String[] args) {
		Curso curso = new Curso(
				Integer.parseInt(JOptionPane.showInputDialog("Código")),
				JOptionPane.showInputDialog("Descrição").toUpperCase(),
				Integer.parseInt(JOptionPane.showInputDialog("Carga Horária")),
				Float.parseFloat(JOptionPane.showInputDialog("valor")),
				JOptionPane.showInputDialog("Titulação").toUpperCase()
				);
		
		
		System.out.println(curso);

	}

}
