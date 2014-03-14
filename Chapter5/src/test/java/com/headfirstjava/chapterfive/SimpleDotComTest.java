package com.headfirstjava.chapterfive;

public class SimpleDotComTest {

    public static void main(String[] args) {

        SimpleDotCom simpleDotCom = new SimpleDotCom();

        int[] locations = {2, 3, 4};
        simpleDotCom.setLocationCells(locations);

        String userGuess = "2";
        String result = simpleDotCom.checkYourself(userGuess);
        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
