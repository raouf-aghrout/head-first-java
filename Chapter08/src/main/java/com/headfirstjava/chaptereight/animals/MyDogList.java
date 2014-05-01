package com.headfirstjava.chaptereight.animals;

public class MyDogList {

    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog d) {

        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Dog added at: " + nextIndex);
            nextIndex++;
        }
    }
}
