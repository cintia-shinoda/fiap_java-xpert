package br.com.descanso.beans;

/*
 Monte uma classe com a média semestral 1, média semestral 2, o nome e a quantidade de faltas de um Aluno. Adicione outra classe para instanciar um objeto, permitindo o preenchimento dos dados em tempo de execução
 */





public class Aluno {

	private double mediaSemestral1;
	private double mediaSemestral2;
	private String nomeAluno;
	private int qtdeFaltas;
	
	
	

	
// GETTERS E SETTERS
	public double getMediaSemestral1() {
		return mediaSemestral1;
	}
	public void setMediaSemestral1(double mediaSemestral1) {
		this.mediaSemestral1 = mediaSemestral1;
	}
	public double getMediaSemestral2() {
		return mediaSemestral2;
	}
	public void setMediaSemestral2(double mediaSemestral2) {
		this.mediaSemestral2 = mediaSemestral2;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public int getQtdeFaltas() {
		return qtdeFaltas;
	}
	public void setQtdeFaltas(int qtdeFaltas) {
		this.qtdeFaltas = qtdeFaltas;
	}

	
	
	
	
// CONSTRUTORES
	public Aluno(double mediaSemestral1, double mediaSemestral2, String nomeAluno, int qtdeFaltas) {
		super();
		this.mediaSemestral1 = mediaSemestral1;
		this.mediaSemestral2 = mediaSemestral2;
		this.nomeAluno = nomeAluno;
		this.qtdeFaltas = qtdeFaltas;
	}
	
	public Aluno() {
		super();
	}


	

	
// SetAll e GetAll
	public void setAll(double mediaSemestral1, double mediaSemestral2, String nomeAluno, int qtdeFaltas) {
		this.mediaSemestral1 = mediaSemestral1;
		this.mediaSemestral2 = mediaSemestral2;
		this.nomeAluno = nomeAluno;
		this.qtdeFaltas = qtdeFaltas;
	}
	
	@Override
	public String toString() {
		return "Aluno [mediaSemestral1=" + mediaSemestral1 + ", mediaSemestral2=" + mediaSemestral2 + ", nomeAluno="
				+ nomeAluno + ", qtdeFaltas=" + qtdeFaltas + "]";
	}
	
	
}
