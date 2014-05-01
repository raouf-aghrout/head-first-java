package com.headfirstjava.chaptereight.animals;

public class MyAnimalList {

    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal animal) {

        if (nextIndex < animals.length) {
            animals[nextIndex] = animal;
            System.out.println("Animal added at: " + nextIndex);
            nextIndex++;
        }
    }
}
