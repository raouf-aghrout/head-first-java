package com.headfirstjava.chaptertwelve.guis;

import com.headfirstjava.chaptertwelve.jpanels.RandomGradientCircleJPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI1D {

    private static JFrame jFrame;
    private static JLabel jLabel;

    public static void main(String[] args) {

        SimpleGUI1D simpleGUI1D = new SimpleGUI1D();
        simpleGUI1D.initialise();
    }

    public void initialise() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton jButtonOne = new JButton("Change Label!");
        jButtonOne.addActionListener(new LabelListener());

        JButton jButtonTwo = new JButton("Change Image Colour");
        jButtonTwo.addActionListener(new ColourListener());

        jLabel = new JLabel("This is a label!");

        JPanel jPanel = new RandomGradientCircleJPanel();

        jFrame.getContentPane().add(BorderLayout.CENTER, jPanel);
        jFrame.getContentPane().add(BorderLayout.EAST, jButtonOne);
        jFrame.getContentPane().add(BorderLayout.SOUTH, jButtonTwo);
        jFrame.getContentPane().add(BorderLayout.WEST, jLabel);

        jFrame.setSize(600, 600);
        jFrame.setVisible(true);
    }

    class LabelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jLabel.setText("I've been changed!");
        }
    }

    class ColourListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jFrame.repaint();
        }
    }
}
