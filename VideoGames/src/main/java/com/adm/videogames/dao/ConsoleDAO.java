package com.adm.videogames.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adm.videogames.model.Console;
import com.adm.videogames.service.ConsoleService;

@Service
public class ConsoleDAO {
	
	@Autowired
	private ConsoleService consoleService;
	
	
	public List<Console> findAll() {
		return consoleService.findAll();
	}
	
	public Console findById(int id) {
		return consoleService.findById(id).orElse(null);
	}
	
	public void save(Console console) {
		consoleService.save(console);
	}
	
	public void updateConsole(Console console) {
		consoleService.save(console);
	}
	
	
	public void deleteById(int id) {
		consoleService.deleteById(id);
	}
	
}
