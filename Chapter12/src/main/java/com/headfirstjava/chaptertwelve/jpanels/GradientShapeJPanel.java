package com.headfirstjava.chaptertwelve.jpanels;

import javax.swing.*;
import java.awt.*;

public class GradientShapeJPanel extends JPanel {

    public void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        GradientPaint gradientPaint = new GradientPaint(100, 100, Color.blue, 200, 200, Color.green);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(100, 100, 200, 200);
    }
}
