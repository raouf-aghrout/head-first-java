package com.headfirstjava.chapterten.calendar;

import java.util.Calendar;

public class CalendarTest {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2004, 0, 7, 15, 40);
        System.out.println("Date: " + calendar.getTime());

        long time = calendar.getTimeInMillis();
        time += 1000 * 60 * 60;

        calendar.setTimeInMillis(time);
        System.out.println("Date Plus 1 Hour: " + calendar.getTime());

        calendar.add(calendar.DATE, 35);
        System.out.println("Date Plus 35 Days: " + calendar.getTime());

        calendar.roll(calendar.DATE, 35);
        System.out.println("Date Rolled 35 Days: " + calendar.getTime());

        calendar.set(calendar.DATE, 1);
        System.out.println("Date Set to the 1st: " + calendar.getTime());
    }
}
