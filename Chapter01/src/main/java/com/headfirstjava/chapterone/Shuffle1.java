package com.headfirstjava.chapterone;

public class Shuffle1 {

    public static void main(String[] args) {

        int x = 3;

        while (x > 0) {
            if (x > 2) {
                System.out.print("A");
            }

            if (x == 2) {
                System.out.print("B C");
            }

            x = x - 1;
            System.out.print("-");

            if (x == 1) {
                System.out.print("D");
                x = x - 1;
            }
        }
    }
}
