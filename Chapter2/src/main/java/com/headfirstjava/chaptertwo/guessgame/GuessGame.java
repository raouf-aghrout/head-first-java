package com.headfirstjava.chaptertwo.guessgame;

public class GuessGame {

    Player playerOne;
    Player playerTwo;
    Player playerThree;

    public void startGame() {
        playerOne = new Player();
        playerTwo = new Player();
        playerThree = new Player();

        int playerOneGuess = 0;
        int playerTwoGuess = 0;
        int playerThreeGuess = 0;

        boolean playerOneIsRight = false;
        boolean playerTwoIsRight = false;
        boolean playerThreeIsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a numberGuessed between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is... " + targetNumber);

            playerOne.guess();
            playerTwo.guess();
            playerThree.guess();

            playerOneGuess = playerOne.numberGuessed;
            System.out.println("Player one guessed... " + playerOneGuess);

            playerTwoGuess = playerTwo.numberGuessed;
            System.out.println("Player two guessed... " + playerTwoGuess);

            playerThreeGuess = playerThree.numberGuessed;
            System.out.println("Player three guessed... " + playerThreeGuess);

            if (playerOneGuess == targetNumber) {
                playerOneIsRight = true;
            }

            if (playerTwoGuess == targetNumber) {
                playerTwoIsRight = true;
            }

            if (playerThreeGuess == targetNumber) {
                playerThreeIsRight = true;
            }

            if (playerOneIsRight || playerTwoIsRight || playerThreeIsRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + playerOneIsRight);
                System.out.println("Player two got it right? " + playerTwoIsRight);
                System.out.println("Player three got it right? " + playerThreeIsRight);
                System.out.println("Game is over!");
                break;
            } else {
                System.out.println("Players will have to try again...");
            }
        }
    }
}
