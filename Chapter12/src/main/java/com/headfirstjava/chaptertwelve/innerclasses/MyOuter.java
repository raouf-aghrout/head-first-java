package com.headfirstjava.chaptertwelve.innerclasses;

public class MyOuter {

    private int x;
    private MyInner myInner = new MyInner();

    private void doStuff() {
        myInner.go();
    }

    class MyInner {

        public void go() {
            x = 42;
        }
    }
}
