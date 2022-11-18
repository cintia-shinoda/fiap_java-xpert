package br.com.fiap.beans;

public class Professor {
	private Endereco endereco;
	private String nome;
	private String formacao;
	private float salario;
	
	
	
	
	
// GETTERS e SETTERS
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
	
	
// CONSTRUTORES
	public Professor(Endereco endereco, String nome, String formacao, float salario) {
		super();
		this.endereco = endereco;
		this.nome = nome;
		this.formacao = formacao;
		this.salario = salario;
	}

	
	public Professor() {
		super();
	}
	
	

// toString
	@Override
	public String toString() {
		return "Professor [endereco=" + endereco + ", nome=" + nome + ", formacao=" + formacao + ", salario=" + salario
				+ "]";
	}
	
	
	
	
// aplicarDissidio
	public String aplicarDissidio(float porcentagem) {
			salario = salario + salario * (porcentagem/100);
			return "Dissídio aplicado";
	}
	
}
