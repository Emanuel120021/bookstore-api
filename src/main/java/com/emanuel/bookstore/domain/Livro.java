package com.emanuel.bookstore.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Livro {
	private Integer id;
	private String nome;
	private String nome_autor;
	private String texto;

	private List<Categoria> Categoria = new ArrayList<>();

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(Integer id, String nome, String nome_autor, String texto,
			List<com.emanuel.bookstore.domain.Categoria> categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.nome_autor = nome_autor;
		this.texto = texto;
		Categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public List<Categoria> getCategoria() {
		return Categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		Categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}

}
