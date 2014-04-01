package com.headfirstjava.chapterten.player;

public class PlayerTestDrive {

    public static void main(String[] args) {

        System.out.println(Player.playerCount);
        Player playerOne = new Player("Tiger Woods");
        System.out.println(Player.playerCount);
    }
}
