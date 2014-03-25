package com.headfirstjava.chapterseven.monsters;

public class MonsterTestDrive {

    public static void main(String[] args) {

        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Dragon();
        monsters[2] = new Monster();

        for (int x = 0; x < 3; x++) {
            monsters[x].frighten(x);
        }
    }
}
