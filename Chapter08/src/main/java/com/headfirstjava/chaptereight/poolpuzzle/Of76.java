package com.headfirstjava.chaptereight.poolpuzzle;

public class Of76 extends Clowns {

    public static void main(String[] args) {

        Nose[] noses = new Nose[3];
        noses[0] = new Acts();
        noses[1] = new Clowns();
        noses[2] = new Of76();

        for (int x = 0; x < 3; x++) {
            System.out.println(
                    noses[x].iMethod()
                            + " "
                            + noses[x].getClass()
            );
        }
    }
}
