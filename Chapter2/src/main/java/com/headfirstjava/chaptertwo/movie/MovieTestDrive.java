package com.headfirstjava.chaptertwo.movie;

public class MovieTestDrive {

    public static void main (String[] args) {

        Movie movieOne = new Movie();
        movieOne.title = "Gone with the Stock";
        movieOne.genre = "Tragic";
        movieOne.rating = -2;

        Movie movieTwo = new Movie();
        movieTwo.title = "Lost in Cubicle Space";
        movieTwo.genre = "Comedy";
        movieTwo.rating = 5;
        movieTwo.playIt();

        Movie movieThree = new Movie();
        movieThree.title = "Byte Club";
        movieThree.genre = "Tragic but ultimately uplifting";
        movieThree.rating = 127;
    }
}
