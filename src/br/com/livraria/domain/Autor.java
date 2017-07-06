package br.com.livraria.domain;

public class Autor {
	
	private Long codigo;
	private String nome;
	private String email;
	
	public Autor(Long codigo, String nome, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
	}
	
	public Autor(){}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
	
		return "Author "+getNome()+" email "+getEmail();
	}
}
