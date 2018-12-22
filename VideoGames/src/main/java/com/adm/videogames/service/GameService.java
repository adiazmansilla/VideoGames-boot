package com.adm.videogames.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adm.videogames.model.Game;

public interface GameService extends JpaRepository<Game,Integer>{
	
	 List<Game> findGameByConsoleId(int id);

}
