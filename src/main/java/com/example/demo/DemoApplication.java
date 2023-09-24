package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// MarioGame mario=new MarioGame();
		Supercontra s1=new Supercontra();
		GameRunner g1=new GameRunner(s1);
		g1.run();
	}

}
