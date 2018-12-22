package com.adm.videogames.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity(name="console")
public class Console {
	
	@Id
	private int id;
	@NotBlank
	private String name;
	
	public Console() {}
	public Console(int id) {
		this.id=id;
		this.name="";
	}
	
	public Console(String name) {
		this.name=name;
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
	@Override
	public String toString() {
		return "Console [id=" + id + ", name=" + name + "]";
	}	
	
}
