package com.headfirstjava.chapterfive.simpledotcomgame;

public class SimpleDotComeTestDrive {

    public static void main(String[] args) {
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        simpleDotCom.setLocationCells(locations);
        String userGuess = "2";
        String result = simpleDotCom.checkYourself(userGuess);
    }
}
