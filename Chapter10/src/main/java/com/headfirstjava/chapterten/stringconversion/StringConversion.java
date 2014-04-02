package com.headfirstjava.chapterten.stringconversion;

public class StringConversion {

    public static void main(String[] args) {

        double doubleOne = 42.5;
        String doubleOneString = "" + doubleOne;
        System.out.println(doubleOneString);

        String doubleTwoString = Double.toString(doubleOne);
        System.out.println(doubleTwoString);
    }
}
