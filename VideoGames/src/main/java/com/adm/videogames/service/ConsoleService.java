package com.adm.videogames.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adm.videogames.model.Console;

public interface ConsoleService extends JpaRepository<Console, Integer>{

}
