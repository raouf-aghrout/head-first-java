package com.headfirstjava.chapterfive.simpledotcomgame;

public class SimpleDotComGame {

    public static void main(String[] args) {

        int numberOfGuesses = 0;
        GameHelper gameHelper = new GameHelper();
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        int randomNumber = (int) (Math.random() * 5);
        int[] locations = {randomNumber, randomNumber + 1, randomNumber + 2};
        simpleDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = gameHelper.getUserInput("Enter a number: ");
            String result = simpleDotCom.checkYourself(guess);
            numberOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.print("You took " + numberOfGuesses + " guesses");
            }
        }
    }
}
