package com.headfirstjava.chaptertwelve.guis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI1B implements ActionListener {

    private JButton jButton;

    public static void main(String[] args) {

        SimpleGUI1B simpleGUI1B = new SimpleGUI1B();
        simpleGUI1B.go();
    }

    public void go() {
        JFrame jFrame = new JFrame();
        jButton = new JButton("Click Me!");

        jButton.addActionListener(this);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(jButton);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jButton.setText("I've been clicked!");
    }
}
