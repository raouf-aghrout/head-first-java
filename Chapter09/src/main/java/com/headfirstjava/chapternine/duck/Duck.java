package com.headfirstjava.chapternine.duck;

public class Duck {

    int size;

    public Duck() {
        System.out.println("Quack!");
        this.size = 10;
        System.out.println("Size is: " + size);
    }

    public Duck(int size) {
        System.out.println("Quack!");
        this.size = size;
        System.out.println("Size is: " + size);
    }
}
