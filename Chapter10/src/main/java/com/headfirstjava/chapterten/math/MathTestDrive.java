package com.headfirstjava.chapterten.math;

public class MathTestDrive {

    public static void main(String[] args) {

        // Random
        double randomDouble = Math.random();
        int randomInteger = (int) (Math.random() + 5);
        System.out.println("Random Double: " + randomDouble);
        System.out.println("Random Integer: " + randomInteger);

        // Absolute
        int absoluteInteger = Math.abs(-240);
        double absoluteDouble = Math.abs(240.45);
        System.out.println("Absolute Integer: " + absoluteInteger);
        System.out.println("Absolute Double: " + absoluteDouble);

        // Round
        int roundedIntegerOne = Math.round(-24.8f);
        int roundedIntegerTwo = Math.round(24.45f);
        System.out.println("Rounded Integer One: " + roundedIntegerOne);
        System.out.println("Rounded Integer Two: " + roundedIntegerTwo);

        // Minimum
        int minimumInteger = Math.min(24, 240);
        double minimumDouble = Math.min(90876.5, 90876.49);
        System.out.println("Minimum Integer: " + minimumInteger);
        System.out.println("Minimum Double: " + minimumDouble);

        // Maximum
        int maximumInteger = Math.max(24, 240);
        double maximumDouble = Math.max(90876.5, 90876.49);
        System.out.println("Maximum Integer: " + maximumInteger);
        System.out.println("Maximum Double: " + maximumDouble);
    }
}
