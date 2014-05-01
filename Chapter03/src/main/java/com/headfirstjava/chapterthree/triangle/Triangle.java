package com.headfirstjava.chapterthree.triangle;

public class Triangle {

    double area;
    int height;
    int length;

    public static void main(String[] args) {
        int x = 0;
        Triangle[] triangleArray = new Triangle[4];

        while (x < 4) { //
            triangleArray[x] = new Triangle();//
            triangleArray[x].height = (x + 1) * 2; //
            triangleArray[x].length = x + 4; //
            triangleArray[x].setArea();//
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + triangleArray[x].area); //
            x = x + 1; //
        }

        int y = x;
        x = 27;
        Triangle t5 = triangleArray[2];
        triangleArray[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    void setArea() {
        area = (height * length) / 2; //
    }
}
