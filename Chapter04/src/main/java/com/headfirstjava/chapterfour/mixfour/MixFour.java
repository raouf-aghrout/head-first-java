package com.headfirstjava.chapterfour.mixfour;

public class MixFour {

    int counter = 0;

    public static void main(String[] args) {

        int count = 0;
        MixFour[] mixFourArray = new MixFour[20];
        int x = 0;

        while (x < 9) {
            mixFourArray[x] = new MixFour();
            mixFourArray[x].counter = mixFourArray[x].counter + 1;
            count = count + 1;
            count = count + mixFourArray[x].maybeNew(x);
            x = x + 1;
        }

        System.out.println(count + " " + mixFourArray[1].counter);
    }

    public int maybeNew(int index) {
        if (index < 5) {
            MixFour mixFour = new MixFour();
            mixFour.counter = mixFour.counter + 1;
            return 1;
        }

        return 0;
    }
}
