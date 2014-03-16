package com.headfirstjava.chaptersix.arraylistmagnet;

import java.util.ArrayList;

public class ArrayListMagnet {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0, "zero");
        arrayList.add(1, "one");
        arrayList.add(2, "two");
        arrayList.add(3, "three");
        printArrayList(arrayList);

        arrayList.remove(2);
        if (arrayList.contains("three")) arrayList.add("four");
        printArrayList(arrayList);

        if (arrayList.indexOf("four") != 4) arrayList.add(4, "4.2");
        printArrayList(arrayList);

        if (arrayList.contains("two")) arrayList.add("2.2");
        printArrayList(arrayList);
    }

    public static void printArrayList(ArrayList<String> arrayList) {
        for (String element : arrayList) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
