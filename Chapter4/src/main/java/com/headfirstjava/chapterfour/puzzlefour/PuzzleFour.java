package com.headfirstjava.chapterfour.puzzlefour;

public class PuzzleFour {

    int ivar;

    public int doStuff(int factor) {
        if (ivar > 100) {
            return ivar * factor;
        } else {
            return ivar * (5 - factor);
        }
    }
}
