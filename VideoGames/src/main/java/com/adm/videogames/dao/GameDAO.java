package com.adm.videogames.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adm.videogames.model.Game;
import com.adm.videogames.service.GameService;

@Service
public class GameDAO {
	
	@Autowired
	private GameService gameService;
	
	public List<Game> findAll(){
		return gameService.findAll();
	}
	
	public Game findById(int id) {
		return gameService.findById(id).orElse(null);
	}
	
	public void save(Game game) {
		gameService.save(game);
	}
	
	public void updateGame(Game game) {
		gameService.save(game);
	}
	
	public void deleteGameById(int id) {
		gameService.deleteById(id);
	}

	public List<Game> findGameByConsoleId(int id) {
		return gameService.findGameByConsoleId(id);
	}

}
