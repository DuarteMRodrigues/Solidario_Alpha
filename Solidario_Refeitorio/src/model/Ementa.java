package model;

import java.util.Date;

public class Ementa {
	Prato[] prato = new Prato[5]; 
	Date dia;
	String descricao;
	 
	public Prato[] getPrato() {
		return prato;
	}

	public void setPrato(Prato[] prato) {
		this.prato = prato;
	}

	public Date getDia() {
		return dia;
	}
	
	public void setDia(Date dia) {
		this.dia = dia;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
