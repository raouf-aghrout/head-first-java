package com.headfirstjava.chaptertwo.tapedeck;

public class TapeDeckTestDrive {

    public static void main(String[] args) {

        TapeDeck tapeDeck = new TapeDeck();
        tapeDeck.canRecord = true;
        tapeDeck.playTape();

        if (tapeDeck.canRecord == true) {
            tapeDeck.recordTape();
        }
    }
}
