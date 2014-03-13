package com.headfirstjava.chaptertwo.drumkit;

public class DrumKitTestDrive {

    public static void main (String[] args) {

        DrumKit drumKit = new DrumKit();
        drumKit.playSnare();
        drumKit.snare = false;
        drumKit.playTopHat();

        if (drumKit.snare == true) {
            drumKit.playSnare();
        }
    }
}
