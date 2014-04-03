package com.headfirstjava.chaptereleven.testexceptions;

public class TestExceptions {

    public static void main(String[] args) {

        String testString = "Yes";

        try {
            System.out.println("Start try!");
            doRisky(testString);
            System.out.println("End try!");
        } catch (ScaryException scaryException) {
            System.out.println("Scary exception!");
        } finally {
            System.out.println("Finally!");
        }

        System.out.println("End of main!");
    }

    private static void doRisky(String test) throws ScaryException {
        System.out.println("Start risky method!");

        if ("Yes".equals(test)) {
            throw new ScaryException();
        }

        System.out.println("End risky!");
        return;
    }
}
