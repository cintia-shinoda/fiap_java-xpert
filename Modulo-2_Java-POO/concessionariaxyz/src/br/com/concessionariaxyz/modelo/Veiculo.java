package br.com.concessionariaxyz.modelo;

public class Veiculo {

	private String cor;
	private String montadora;
	private float valor;
	
	//Classes Wrappers: classe que apoia os tipos primitivos
	//Float => float
	//Integer => int
	//Double => double
	//Boolean => boolean
	
	
	// sintaxe de criação de método:
	// <modificador> < tipo do retorno> < nome do método> (<tipo param> <nome param>) {
	
	// boolean < char <  byte < short < int < long < float < double
	
	
// COR
	public void preencherCor(String param) {
		if(param.length()>2) {
			cor = param.toUpperCase();
		}
	}
	

	public String retornarCor() {
		return cor;
	}
	
	
// MONTADORA
	public void preencherMontadora(String param) {
		montadora = param.toUpperCase();
	}
	
	
	public String retornarMontadora() {
		return montadora;
	}
	
	
// VALOR	
	public void  preencherValor(float param) {
		if(param >0) {
			valor = param;
		}
	}
	
	
	public float retornarValor() {
		return valor; 
	}

	
// toString(): visualizar todos os dados do objeto
	public String toString() {
		return "Cor: " + cor + "\n" + "Montadora: " + montadora + "\n" + "Valor: " + valor;
	}
	
	
	public float retornarDesconto() {
		return valor * (float) 0.9;  //casting
	}
	
	public float retornarDesconto(float porcentagem) {
		return valor - valor * (porcentagem/100);
	}
	
}
