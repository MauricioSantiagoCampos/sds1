package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.entities.enums.Platform;

public class GameDTO implements Serializable{

	private static final long serialVersionUID = 1L;	
	
	
// Classe DTO é responsavel pela interação Entre Entidade ( Game ) com o Controlador Rest ( GameResource )	
		
// Atributos	
	
	private Long id;
	private String title;
	private Platform platform;
	
// Construtores	
	
	public GameDTO() {		
	}
	
	public GameDTO(Game entity) {		
		id = entity.getId();
		title = entity.getTitle();
		platform = entity.getPlatform();
	}

// Getters e Setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
}
