package com.headfirstjava.chaptertwelve.jpanels;

import javax.swing.*;
import java.awt.*;

public class ColouredShapeJPanel extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(100, 100, 200, 200);
    }
}
