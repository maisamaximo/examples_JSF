package br.com.dominio.model;

import java.io.Serializable;

import br.com.dominio.controller.TipoAtividade;

public class Atividade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private TipoAtividade tipoAtividade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TipoAtividade getTipoAtividade() {
		return tipoAtividade;
	}
	public void setTipoAtividade(TipoAtividade tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}
	
	
}
