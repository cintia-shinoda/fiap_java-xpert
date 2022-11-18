package br.com.descanso.beans;

/*
Crie uma classe para representar uma pessoa, com os atributos nome, idade e altura. Crie métodos para alterar os valores dos atributos e também para obter os valores desses atributos.
 */




public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	
	
	
	
	
// GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
	
// CONSTRUTORES	
	public Pessoa(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	
	public Pessoa() {
		super();
	}

	
	
	

// setAll e getAll

	public void setAll(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura	;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}



}
	