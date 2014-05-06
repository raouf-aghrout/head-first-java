package com.headfirstjava.chaptertwelve;

import javax.swing.*;

public class SimpleGUI1 {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("Click Me!");

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(jButton);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }
}
