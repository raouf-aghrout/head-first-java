package com.headfirstjava.chapterfour.xcopy;

public class XCopy {

    public static void main(String[] args) {
        int orig = 42;
        XCopy xCopy = new XCopy();
        int y = xCopy.go(orig);
        System.out.println(orig + " " + y);
    }

    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
