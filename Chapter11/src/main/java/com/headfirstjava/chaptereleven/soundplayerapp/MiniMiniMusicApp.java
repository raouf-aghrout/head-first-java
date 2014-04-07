package com.headfirstjava.chaptereleven.soundplayerapp;

import javax.sound.midi.*;

public class MiniMiniMusicApp {

    public static void main(String[] args) {
        MiniMiniMusicApp miniMiniMusicApp = new MiniMiniMusicApp();
        miniMiniMusicApp.play();
    }

    private void play() {

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence sequence = new Sequence(Sequence.PPQ, 4);

            Track track = sequence.createTrack();

            ShortMessage shortMessageA = new ShortMessage();
            shortMessageA.setMessage(144, 1, 44, 100);

            MidiEvent noteOn = new MidiEvent(shortMessageA, 1);
            track.add(noteOn);

            ShortMessage shortMessageB = new ShortMessage();
            shortMessageB.setMessage(128, 1, 44, 100);

            MidiEvent noteOff = new MidiEvent(shortMessageB, 16);
            track.add(noteOff);

            sequencer.setSequence(sequence);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
