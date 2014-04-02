package com.headfirstjava.chapterten.staticsuper;

public class StaticSuper {

    static {
        System.out.println("Super static block!");
    }

    public StaticSuper() {
        System.out.println("Super constructor!");
    }
}
