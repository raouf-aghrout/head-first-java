package com.headfirstjava.chaptereight.animals;

public class AnimalTestDrive {

    public static void main(String[] args) {

        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        list.add(a);
        list.add(c);
    }
}