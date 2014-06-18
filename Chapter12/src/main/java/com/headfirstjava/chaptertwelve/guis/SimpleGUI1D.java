package com.headfirstjava.chaptertwelve.guis;

import com.headfirstjava.chaptertwelve.jpanels.RandomGradientCircleJPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleGUI1D {

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        SimpleGUI1D gui = new SimpleGUI1D();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelButtonListener());

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorButtonListener());

        label = new JLabel("I'm a label");
        RandomGradientCircleJPanel drawPanel = new RandomGradientCircleJPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    class LabelButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Ouch!");
        }
    }

    class ColorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    }
}
