package com.headfirstjava.chapterfourteen.gamesavertest;

import java.io.Serializable;

public class GameCharacter implements Serializable {

    int power;
    String type;
    String[] weapons;

    public GameCharacter(int p, String t, String[] w) {
        power = p;
        type = t;
        weapons = w;
    }

    public String getType() {
        return type;
    }
}
