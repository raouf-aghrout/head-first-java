package com.headfirstjava.chaptereleven.soundplayerapp;

public class MiniMusicCmdLine {

    public static void main(String[] args) {

        MiniMusicCmdLine miniMusicCmdLine = new MiniMusicCmdLine();

        if (args.length < 2) {
            System.out.println("Don't forget the instrument and note arguments!");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);

        }
    }
}
