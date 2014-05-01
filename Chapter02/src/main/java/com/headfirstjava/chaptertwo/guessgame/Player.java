package com.headfirstjava.chaptertwo.guessgame;

public class Player {

    int numberGuessed = 0;

    public void guess() {
        numberGuessed = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + numberGuessed);
    }
}
