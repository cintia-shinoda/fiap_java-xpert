 package br.com.fiap.beans;

/*
Design Patterns
DTO  (Data Transfer Object): melhores práticas para a classe modelo
- TODOS os atributos devem ser private,
- Cada atributo deve possuir INDIVIDUALMENTE um método GETTER e um método SETTER;
- TODA classe modelo/padrão/beans deve possuir no mínimo dois construtores
a) uma vazio (sem nenhum parâmeetro
b) um cheio (permite preencher todo o objeto
*/


public class Aluno {
	private int rm;
	private String nome;
	private String email;
	private String fone;
	private Endereco endereco;
	
	
	
// GETTERS e SETTERS
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

	
// CONSTRUTORES	
	public Aluno(int rm, String nome, String email, String fone, Endereco endereco) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	
	public Aluno() {
		super();
	}
	
	
	
	
	
// toString
	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", endereco=" + endereco
				+ "]";
	}
	
	
	
	
/*// setAll	
	public void setAll(int rm, String nome, String email, String fone, Endereco endereco) {
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
}
