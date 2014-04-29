package com.headfirstjava.chaptereleven.soundplayerapp;

import javax.sound.midi.*;

public class MiniMusicCmdLine {

    public static void main(String[] args) {

        MiniMusicCmdLine miniMusicCmdLine = new MiniMusicCmdLine();
        miniMusicCmdLine.play(40, 70);

        /* if (args.length < 2) {
            System.out.println("Don't forget the instrument and note arguments!");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            miniMusicCmdLine.play(instrument, note);
        } */
    }

    private void play(int instrument, int note) {

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            ShortMessage firstMessage = new ShortMessage();
            firstMessage.setMessage(192, 1, instrument, 0);

            MidiEvent changeInstrument = new MidiEvent(firstMessage, 1);
            track.add(changeInstrument);

            ShortMessage shortMessageA = new ShortMessage();
            shortMessageA.setMessage(144, 1, note, 100);

            MidiEvent noteOn = new MidiEvent(shortMessageA, 1);
            track.add(noteOn);

            ShortMessage shortMessageB = new ShortMessage();
            shortMessageB.setMessage(128, 1, note, 100);

            MidiEvent noteOff = new MidiEvent(shortMessageB, 16);
            track.add(noteOff);

            sequencer.setSequence(sequence);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
