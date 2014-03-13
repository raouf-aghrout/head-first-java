package com.headfirstjava.chapterone;

public class BeerSong {

    public static void main(String[] args) {

        int numberOfBeers = 99;
        String word = "bottles";

        while (numberOfBeers > 0) {

            if (numberOfBeers < 2) {
                word = "bottle";
            }

            System.out.println(numberOfBeers + " " + word + " of beer on the wall!");
            System.out.println(numberOfBeers + " " + word + " of beer!");
            System.out.println("Take one down!");
            System.out.println("Pass it around!");
            numberOfBeers = numberOfBeers - 1;

            if (numberOfBeers < 1) {
                System.out.println("No more bottles of beer on the wall!");
            }
        }
    }
}