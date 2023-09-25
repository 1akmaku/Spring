package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// MarioGame mario=new MarioGame();
		//Supercontra s1=new Supercontra();
		// PacmanGame p1=new PacmanGame();
		Gamingconsole c1=new MarioGame();
		GameRunner g1=new GameRunner(c1);
		g1.run();
	}

}
