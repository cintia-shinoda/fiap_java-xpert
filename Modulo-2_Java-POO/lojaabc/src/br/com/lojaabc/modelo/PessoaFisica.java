package br.com.lojaabc.modelo;

public class PessoaFisica extends Cliente{
	private String cpf;
	private String rg;
	
	
	
// Getters e Setters
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
// Construtores
	public PessoaFisica(String nome, String email, String fone, String cpf, String rg) {
		super(nome, email, fone);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	
	
	public PessoaFisica() {
		super();
	}
	
	
	
// toString
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", toString()=" + super.toString() + "]";
	}
	
	

// setAll
	public void setAll(String nome, String email, String fone, String cpf, String rg) {
		super.setAll(nome, email, fone);
		this.cpf = cpf;
		this.rg = rg;
	}
	
}
