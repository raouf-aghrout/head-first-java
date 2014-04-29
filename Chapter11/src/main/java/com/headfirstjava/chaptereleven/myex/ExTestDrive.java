package com.headfirstjava.chaptereleven.myex;

public class ExTestDrive {

    public static void main(String[] args) {

        String test = "No";

        try {
            System.out.print("T");
            doRisky(test);
        } catch (MyEx e) {
            System.out.print("a");
        } finally {
            System.out.print("w");
            System.out.print("s");
        }
    }

    private static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("Yes".equals(t)) throw new MyEx();
        System.out.print("r");
        System.out.print("o");
    }
}
