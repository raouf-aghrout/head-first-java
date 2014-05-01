package com.headfirstjava.chapterseven.boats;

public class TestBoats {

    public static void main(String[] args) {

        Boat boat = new Boat();
        SailBoat sailBoat = new SailBoat();
        RowBoat rowBoat = new RowBoat();

        sailBoat.setLength(32);
        boat.move();
        rowBoat.move();
        sailBoat.move();
    }
}
