package com.adm.videogames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adm.videogames.dao.ConsoleDAO;
import com.adm.videogames.model.Console;

@RestController
public class ConsoleController {
	
	@Autowired
	ConsoleDAO consoleDao;

	@GetMapping("/consoles")
	public List<Console> findAll() {
		return consoleDao.findAll();
	}
	
	@GetMapping("/consoles/{id}")
	public Console findById(@PathVariable int id) {
		return consoleDao.findById(id);
	}
	
	@PostMapping("/consoles")
	public void save(@RequestBody Console console) {
		consoleDao.save(console);
	}
	
	@PutMapping("/consoles/{id}")
	public void updateTopic(@RequestBody Console console, @PathVariable int id) {
		consoleDao.updateConsole(console);
	}
	
	@DeleteMapping("/consoles/{id}")
	public void deleteById(@PathVariable("id") int id) {
		consoleDao.deleteById(id);
	}
}
