package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class ArcDemo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        Shape arc = new Arc2D.Double(100, 100, 60, 60, 30, 120, Arc2D.PIE);
        ((Graphics2D) g).draw(arc);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.add(new ArcDemo());
        f.setVisible(true);
    }

}
