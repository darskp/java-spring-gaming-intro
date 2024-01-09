package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PacMan;
import com.example.demo.game.SuperContra;

public class AppGamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		var game=new MarioGame();
//		var game=new SuperContra();
		var game=new PacMan(); //object creation
		var gameRunner=new GameRunner(game); //object creation + wiring of dependencies
		gameRunner.run();
	}

}
