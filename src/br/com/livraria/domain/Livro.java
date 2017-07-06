package br.com.livraria.domain;

public class Livro {
	
	private Long cod;
	private String nome;
	private Autor autor;
	private Editora editora;
	private String isbn;
	
	public Livro(Long cod, String nome, Autor autor, Editora editora, String isbn) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.isbn = isbn;
	}

	public Livro(){}
	
	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
		
	
	
	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	@Override
	public String toString() {
		return "Livro "+getNome()+" editora "+getEditora().getNome()+" autor "+getAutor().getNome();
	}
	
}
