package com.algaworks.model;

public enum StatusTitulo {
	
	PENDENTE("Pendente"),
	RECEBIDO("Recebido"),
	CANCELADO("cancelado");
	
	private String descricao;

	StatusTitulo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
