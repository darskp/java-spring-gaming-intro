package com.example.demo.config;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;


public class App01GamingSpringBean {
	
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(GamingConfig.class)){
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		}
	}

}
