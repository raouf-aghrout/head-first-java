package com.headfirstjava.chaptersix.dotcomgame;

import java.util.ArrayList;

public class DotComBust {

    private GameHelper gameHelper = new GameHelper();
    private ArrayList<DotCom> dotComArrayList = new ArrayList<>();
    private int numberOfGuesses = 0;

    public static void main(String[] args) {
        DotComBust dotComBustGame = new DotComBust();
        dotComBustGame.setUpGame();
        dotComBustGame.startPlaying();
    }

    private void setUpGame() {
        DotCom dotComOne = new DotCom();
        dotComOne.setName("Pets.com");
        DotCom dotComTwo = new DotCom();
        dotComTwo.setName("eToys.com");
        DotCom dotComThree = new DotCom();
        dotComThree.setName("Go2.com");
        dotComArrayList.add(dotComOne);
        dotComArrayList.add(dotComTwo);
        dotComArrayList.add(dotComThree);

        System.out.println("Your goal is to sink three Dot Coms!");
        System.out.println(dotComOne.getName() + ", " + dotComTwo.getName() + ", " + dotComThree.getName());
        System.out.println("Try and sink them all in the fewest number of guesses!");

        for (DotCom dotComToSet : dotComArrayList) {
            ArrayList<String> newLocation = gameHelper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComArrayList.isEmpty()) {
            String userGuess = gameHelper.getUserInput("Enter a guess: ");
            checkUserGuess(userGuess);
        }

        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numberOfGuesses++;
        String result = "Miss!";

        for (DotCom dotComToTest : dotComArrayList) {
            result = dotComToTest.checkYourself(userGuess);

            if (result.equals("Hit!")) break;

            if (result.equals("Kill!")) {
                dotComArrayList.remove(dotComToTest);
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");

        if (numberOfGuesses <= 18) {
            System.out.println("It only took you " + numberOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numberOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }
}
