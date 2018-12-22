package com.adm.videogames.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity(name="games")
public class Game {
	
	@Id
	private int id;
	@NotBlank
	private String name;
	@NotBlank
	private int consoleId;
	
	public Game() {}
	
	public Game(int id, String name, int consoleId) {
		
		this.id=id;
		this.name=name;
		this.consoleId=consoleId;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getConsoleId() {
		return consoleId;
	}

	public void setConsoleId(int consoleId) {
		this.consoleId = consoleId;
	}


}
