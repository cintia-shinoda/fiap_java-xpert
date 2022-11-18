package br.com.caicai.modelo;

public class Elevador {

// ATRIBUTOS
	private String nome;
	private int maximoPessoas;
	private int andarMaximo;
	private int andarMinimo;
	private int andarAtual;
	private int qtdePessoas;
	
	
// MÉTODOS
	public void inicializar(String pNome, int pMaxPessoas, int pAndarMax, int pAndarMin, int pAndarAtual, int pQtdePessoas) {
		nome = pNome;
		maximoPessoas = pMaxPessoas;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		andarAtual = pAndarAtual;
		qtdePessoas = pQtdePessoas;
	}
	
	
	public String toString() {
		return "Nome: " + nome + "\n" + "Máximo de Pessoas: " + maximoPessoas + "\n" + "Andar Máximo: " + andarMaximo + "\n" + "Andar Mínimo: " + andarMinimo + "\n" + "Andar Atual: "  + andarAtual + "\n" + "Quantidade de Pessoas: " + qtdePessoas; 
	}
	
	/*  Gerado pelo menu "Source" > "Generate toString()"
	@Override
	public String toString() {
		return "Elevador [nome=" + nome + ", maximoPessoas=" + maximoPessoas + ", andarMaximo=" + andarMaximo
				+ ", andarMinimo=" + andarMinimo + ", andarAtual=" + andarAtual + ", qtdePessoas=" + qtdePessoas + "]";
	}
	*/
	
	
	public void entrar() {
		if (qtdePessoas < maximoPessoas) {
			qtdePessoas += 1;
		}	
	}
	
	
	public void sair() {
		if (qtdePessoas > 0) {
			qtdePessoas -= 1;
		}
	}
	
	
	public String subir(int andar) {
		if ((andarAtual + andar) <= andarMaximo) {
			andarAtual += andar;
			return "Subindo";
		}
		return "Não foi possível subir";
	}
	
	
	public String descer(int andar) {
		if ((andarAtual - andar) >= andarMinimo) {
			andarAtual -= andar;
			return "Descendo";
		} 
		return "Não foi possível descer";
	}
	
	
	public String descer() {
		if ((andarAtual - 1) > andarMinimo) {
			andarAtual -= 1;
			return "Descendo 1 andar";
		}
		return "Não foi possível descer";
	}
	
}
