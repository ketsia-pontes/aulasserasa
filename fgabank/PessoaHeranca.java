package fgabank;

public class PessoaHeranca {
	
	private String nome;
	private String email;
	private String telefone;
	
	public PessoaHeranca() {
		//metodo construtor default (o preenchimento dos atributos é obrigatorio)
	}
	
	
	public PessoaHeranca(String nome, String email, String telefone) {
		//metodo construtor que obriga que os atributos dentro do parenteses sejam preenchidos)
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		//os demais atributos definidos (profissao, email e telefone, n serao obrigatorios)
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
