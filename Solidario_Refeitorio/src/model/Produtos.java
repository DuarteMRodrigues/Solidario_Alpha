package model;

import java.util.Date;

public class Produtos {

	String nome;
	int quantidade;
	String tipo;
	String categoriaAlimentar;
	Date prazoValidade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCategoriaAlimentar() {
		return categoriaAlimentar;
	}

	public void setCategoriaAlimentar(String categoriaAlimentar) {
		this.categoriaAlimentar = categoriaAlimentar;
	}

	public Date getPrazoValidade() {
		return prazoValidade;
	}

	public void setPrazoValidade(Date prazoValidade) {
		this.prazoValidade = prazoValidade;
	}

	public boolean verificarPrazo()
	{
		return false;
	}
}
