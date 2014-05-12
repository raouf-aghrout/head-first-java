package com.headfirstjava.chaptertwelve.jpanels;

import javax.swing.*;
import java.awt.*;

public class RandomColourCircleJPanel extends JPanel {

    public void paintComponent(Graphics g) {
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color color = new Color(red, green, blue);
        g.setColor(color);
        g.fillOval(100, 100, 200, 200);
    }
}
