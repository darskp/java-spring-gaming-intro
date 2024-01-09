package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
import com.example.demo.game.PacMan;

@Configuration
public class GamingConfig {
	
	@Bean
	public GamingConsole game() {
		return new PacMan();
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
	var GameRunner=new GameRunner(game);
	return GameRunner;
	}
}
