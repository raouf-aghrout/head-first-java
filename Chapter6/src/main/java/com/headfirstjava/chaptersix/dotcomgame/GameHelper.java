package com.headfirstjava.chaptersix.dotcomgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");

        try {
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
            inputLine = inputStream.readLine();

            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int dotComSize) {
        ArrayList<String> alphaCells = new ArrayList<>();
        String[] alphaCoords = new String[dotComSize];
        String temp = null;
        int[] coords = new int[dotComSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int inc = 1;

        if ((comCount % 2) == 1) {
            inc = gridLength;
        }

        while (!success && attempts++ < 200) {
            location = (int) (Math.random() * gridSize);
            int x = 0;
            success = true;

            while (success && x < dotComSize) {

                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += inc;

                    if (location >= gridSize) {
                        success = false;
                    }

                    if (x > 0 && (location % gridLength == 0)) {
                        success = false;
                    }
                } else {
                    success = false;
                }
            }
        }

        int x = 0;
        int row = 0;
        int column = 0;

        while (x < dotComSize) {
            grid[coords[x]] = 1;
            row = (int) (coords[x] / gridLength);
            column = coords[x] % gridLength;
            temp = String.valueOf(alphabet.charAt(column));

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }

        return alphaCells;
    }
}
