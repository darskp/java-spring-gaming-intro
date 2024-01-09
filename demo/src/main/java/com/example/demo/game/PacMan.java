package com.example.demo.game;

public class PacMan implements GamingConsole{
	@Override
	public void up() {
	System.out.println("Jump");
	}
	
	@Override
	public void down() {
	System.out.println("Go into a hole");
	}
	
	@Override
	public void left() {
	System.out.println("Go Back");
	}
	
	@Override
	public void right() {
	System.out.println("Accelerate");
	}
}
