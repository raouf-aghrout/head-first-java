package com.headfirstjava.chaptertwelve.guis;

import com.headfirstjava.chaptertwelve.jpanels.RandomGradientCircleJPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI1C implements ActionListener {

    private static JFrame jFrame;
    private static JButton jButton;

    public static void main(String[] args) {

        SimpleGUI1C responsiveGUI = new SimpleGUI1C();
        responsiveGUI.initialise();
    }

    public void initialise() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jButton = new JButton("Change Image!");
        jButton.addActionListener(this);

        JPanel jPanel = new RandomGradientCircleJPanel();

        jFrame.getContentPane().add(BorderLayout.CENTER, jPanel);
        jFrame.getContentPane().add(BorderLayout.SOUTH, jButton);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jFrame.repaint();
    }
}
