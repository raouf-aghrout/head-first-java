package com.headfirstjava.chapterseven.mixedmessages;

class C extends B {

    @Override
    public void m3() {
        System.out.print("C's m3, " + (ivar + 6));
    }
}
