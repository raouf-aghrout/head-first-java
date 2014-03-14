package com.headfirstjava.chapterfour.gooddog;

public class GoodDogTestDrive {

    public static void main(String[] args) {

        GoodDog goodDogOne = new GoodDog();
        goodDogOne.setSize(70);
        GoodDog goodDogTwo = new GoodDog();
        goodDogTwo.setSize(8);
        System.out.println("Dog one: " + goodDogOne.getSize());
        System.out.println("Dog two: " + goodDogTwo.getSize());
        goodDogOne.bark();
        goodDogTwo.bark();
    }
}
