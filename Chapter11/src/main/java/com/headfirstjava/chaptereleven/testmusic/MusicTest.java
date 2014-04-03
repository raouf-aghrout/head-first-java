package com.headfirstjava.chaptereleven.testmusic;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest {

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer!");
        } catch (MidiUnavailableException m) {
            System.out.println("Did not get a sequencer!");
        }
    }

    public static void main(String[] args) {
        MusicTest musicTest = new MusicTest();
        musicTest.play();
    }
}
