package com.headfirstjava.chapterten.numberformatting;

public class TestNumberFormatting {

    public static void main(String[] args) {

        String stringOne = String.format("%,d", 1000000000);
        System.out.println(stringOne);

        String stringTwo = String.format("I have %.2f bugs to fix.", 476578.09876);
        System.out.println(stringTwo);

        String stringThree = String.format("I have %,.2f bugs to fix.", 476578.09876);
        System.out.println(stringThree);

        String stringFour = String.format("%d", 42);
        System.out.println(stringFour);

        String stringFive = String.format("%.3f", 42.000000);
        System.out.println(stringFive);

        String stringSix = String.format("%x", 42);
        System.out.println(stringSix);

        String stringSeven = String.format("%c", 42);
        System.out.println(stringSeven);

        int one = 20456654;
        double two = 100567890.248907;
        String stringEight = String.format("The rank is %,d out of %,.2f", one, two);
        System.out.println(stringEight);
    }
}
