package com.headfirstjava.chaptertwelve.jpanels;

import javax.swing.*;

public class TestGUI {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new ColouredShapeJPanel();

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(jPanel);
        jFrame.setSize(600, 600);
        jFrame.setVisible(true);
    }
}
