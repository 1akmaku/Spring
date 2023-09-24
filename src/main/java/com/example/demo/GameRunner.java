package com.example.demo;

public class GameRunner {

    // private MarioGame newgame;
    private Supercontra newgame;

    public GameRunner(Supercontra s1) 
    {
        this.newgame=s1;
        
    }

    public void run()
    {
        newgame.up();
        newgame.down();
        newgame.left();
        newgame.right();

    }

}
