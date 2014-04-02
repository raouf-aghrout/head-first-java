package com.headfirstjava.chapterten.dateformatting;

import java.util.Date;

public class TestDateFormatting {

    public static void main(String[] args) {

        String stringOne = String.format("%tc", new Date());
        System.out.println(stringOne);

        String stringTwo = String.format("%tr", new Date());
        System.out.println(stringTwo);

        Date today = new Date();

        String stringThree = String.format("%tA, %tB %td", today, today, today);
        System.out.println(stringThree);

        String stringFour = String.format("%tA, %<tB %<td", today);
        System.out.println(stringFour);
    }
}
