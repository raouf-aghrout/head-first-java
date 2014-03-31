package com.headfirstjava.chapternine.radiator;

public class SimUnit {

    private String botType;

    public SimUnit(String botType) {
        this.botType = botType;
        System.out.println("New SimUnit created: " + botType);
    }

    public int powerUse() {
        if ("Retention".equals(botType)) {
            return 2;
        } else {
            // return 4;
            return 3;
        }
    }
}
