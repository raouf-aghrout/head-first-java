package com.headfirstjava.chapterfour.improveddog;

public class ImprovedDog {

    void bark(int numberOfBarks) {
        while (numberOfBarks > 0) {
            System.out.println("Ruff!");
            numberOfBarks = numberOfBarks - 1;
        }
    }
}
