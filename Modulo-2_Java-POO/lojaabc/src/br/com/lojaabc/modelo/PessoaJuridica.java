package br.com.lojaabc.modelo;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String  cnae;
	
	
	
// Getters e Setters	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnae() {
		return cnae;
	}
	public void setCnae(String cnae) {
		this.cnae = cnae;
	}
	
	

// Construtores	
	public PessoaJuridica(String nome, String email, String fone, String cnpj, String cnae) {
		super(nome, email, fone);
		this.cnpj = cnpj;
		this.cnae = cnae;
	}
	public PessoaJuridica() {
		super();
	}
	
	
	
	public void setAll(String nome, String email, String fone, String cnpj, String cnae) {
		super.setAll(nome, email, fone);
		this.cnpj = cnpj;
		this.cnae = cnae;
	}
	
	
	
// toString
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", cnae=" + cnae + ", getNome()=" + getNome() + ", getEmail()="
				+ getEmail() + ", getFone()=" + getFone() + "]";
	}
	
	
	


	
	
}
