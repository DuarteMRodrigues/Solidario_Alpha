package model;

public class Prato extends Produtos{
	String nome;
	Produtos[] ingredientes = new Produtos[15];
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Produtos[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Produtos[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void adicionarPrato()
	{
		
	}
}
