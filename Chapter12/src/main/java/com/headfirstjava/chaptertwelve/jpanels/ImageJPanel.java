package com.headfirstjava.chaptertwelve.jpanels;

import javax.swing.*;
import java.awt.*;

public class ImageJPanel extends JPanel {

    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("C://Users//aghro_000//IdeaProjects//HeadFirstJava//Chapter12//src//main//resources//cat.jpg").getImage();
        g.drawImage(image, 5, 5, this);
    }
}
