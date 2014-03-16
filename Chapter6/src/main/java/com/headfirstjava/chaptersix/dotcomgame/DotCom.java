package com.headfirstjava.chaptersix.dotcomgame;

import java.util.ArrayList;

public class DotCom {

    private String name;
    private ArrayList<String> locationCells;

    public String checkYourself(String userInput) {
        String result = "Miss!";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Kill!";
                System.out.println("Ouch! You sunk " + name + " :(");
            } else {
                result = "Hit!";
            }
        }

        return result;
    }

    public ArrayList<String> getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
