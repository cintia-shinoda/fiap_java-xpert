package br.com.lojaabc.modelo;

public class Cliente {

	private String nome;
	private String email;
	private String fone;
	
	
	
// Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	
	
// Construtores
	public Cliente(String nome, String email, String fone) {
		super();
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	
	
	
	public Cliente() {
		super();
	}

	
	
// toString
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", fone=" + fone + "]";
	}

	
	
// setAll
	public void setAll(String nome, String email, String fone) {
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	
	
}
