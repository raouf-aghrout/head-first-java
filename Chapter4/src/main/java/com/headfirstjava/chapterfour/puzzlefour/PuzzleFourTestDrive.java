package com.headfirstjava.chapterfour.puzzlefour;

public class PuzzleFourTestDrive {

    public static void main(String[] args) {
        PuzzleFour[] puzzleFours = new PuzzleFour[6];
        int y = 1;
        int x = 0;
        int result = 0;

        while (x < 6) {
            puzzleFours[x] = new PuzzleFour();
            puzzleFours[x].ivar = y;
            y = y * 10;
            x = x + 1;
        }

        x = 6;

        while (x > 0) {
            x = x - 1;
            result = result + puzzleFours[x].doStuff(x);
        }

        System.out.println("Result: " + result);
    }
}
