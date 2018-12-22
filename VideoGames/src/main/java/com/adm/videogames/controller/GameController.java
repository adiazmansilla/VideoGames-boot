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

import com.adm.videogames.dao.GameDAO;
import com.adm.videogames.model.Game;

@RestController
public class GameController {
	
	@Autowired
	private GameDAO gameDao;
	
	@GetMapping("/consoles/games")
	public List<Game> findAll(){
		return gameDao.findAll();
	}
	
	@GetMapping("/consoles/{id}/games/")
	public List<Game> findAllById(@PathVariable int id){
		return gameDao.findGameByConsoleId(id);
	}
	
	@GetMapping("/consoles/games/{id}")
	public Game findById(@PathVariable int id) {
		return gameDao.findById(id);
	}
	
	@PostMapping("/consoles/games/")
	public void save(@RequestBody Game game) {
		gameDao.save(game);
	}

	@PutMapping("/consoles/games/{id}")
	public void updateGameById(@PathVariable int id, @RequestBody Game game) {
		gameDao.save(game);
	}
	
	@DeleteMapping("consoles/games/{id}")
	public void deleteGameById(@PathVariable int id) {
		gameDao.deleteGameById(id);
	}
}
