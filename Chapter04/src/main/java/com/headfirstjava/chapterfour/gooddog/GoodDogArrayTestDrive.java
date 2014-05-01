package com.headfirstjava.chapterfour.gooddog;

public class GoodDogArrayTestDrive {

    public static void main(String[] args) {

        GoodDog[] goodDogs = new GoodDog[2];
        goodDogs[0] = new GoodDog();
        goodDogs[1] = new GoodDog();

        goodDogs[0].setSize(70);
        goodDogs[1].setSize(8);

        System.out.println("Dog one: " + goodDogs[0].getSize());
        System.out.println("Dog two: " + goodDogs[1].getSize());
        goodDogs[0].bark();
        goodDogs[1].bark();
    }
}
