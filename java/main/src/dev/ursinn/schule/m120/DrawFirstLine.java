package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;

public class DrawFirstLine extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(10, 10, 100, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(100, 100);
        f.add(new DrawFirstLine());
        f.setVisible(true);
    }

}
