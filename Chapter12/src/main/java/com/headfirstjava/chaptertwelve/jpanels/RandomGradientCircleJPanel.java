package com.headfirstjava.chaptertwelve.jpanels;

import javax.swing.*;
import java.awt.*;

public class RandomGradientCircleJPanel extends JPanel {

    public void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        int redOne = (int) (Math.random() * 255);
        int greenOne = (int) (Math.random() * 255);
        int blueOne = (int) (Math.random() * 255);
        Color colorOne = new Color(redOne, greenOne, blueOne);

        int redTwo = (int) (Math.random() * 255);
        int greenTwo = (int) (Math.random() * 255);
        int blueTwo = (int) (Math.random() * 255);
        Color colorTwo = new Color(redTwo, greenTwo, blueTwo);

        GradientPaint gradientPaint = new GradientPaint(100, 100, colorOne, 200, 200, colorTwo);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(100, 100, 200, 200);
    }
}
