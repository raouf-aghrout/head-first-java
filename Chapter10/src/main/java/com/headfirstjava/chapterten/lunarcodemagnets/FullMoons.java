package com.headfirstjava.chapterten.lunarcodemagnets;

import java.util.Calendar;

public class FullMoons {

    static int DAY_IN_MILLISECONDS = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2004, 0, 7, 15, 40);

        long day1 = calendar.getTimeInMillis();

        for (int x = 0; x < 60; x++) {
            day1 += (DAY_IN_MILLISECONDS * 29.52);
            calendar.setTimeInMillis(day1);
            System.out.println(String.format("Full moon on: %tc", calendar));
        }
    }
}
