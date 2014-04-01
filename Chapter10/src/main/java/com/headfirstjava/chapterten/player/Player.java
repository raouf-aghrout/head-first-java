package com.headfirstjava.chapterten.player;

public class Player {

    public static int playerCount = 0;
    private String name;

    public Player(String playerName) {
        this.name = playerName;
        playerCount++;
    }
}
