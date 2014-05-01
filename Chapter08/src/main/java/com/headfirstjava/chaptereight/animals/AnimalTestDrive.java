package com.headfirstjava.chaptereight.animals;

public class AnimalTestDrive {

    public static void main(String[] args) {

        MyAnimalList list = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();
        list.add(dog);
        list.add(cat);

        System.out.println("Is Dog equal to Cat? " + dog.equals(cat));

        System.out.println("The hashCode of Dog is: " + cat.hashCode());

        System.out.println("The getClass of Cat is: " + cat.getClass());

        System.out.println("The toString of Dog is: " + dog.toString());
    }
}
