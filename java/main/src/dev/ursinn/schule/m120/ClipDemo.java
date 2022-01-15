package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;

public class ClipDemo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics gcopy = g.create();
        g.clipRect(100, 100, 100, 100);
        g.setColor(Color.ORANGE);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.BLACK);
        g.drawOval(150, 150, 100, 100);

        g.clipRect(250, 250, 50, 50);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 5000, 5000);

        gcopy.setColor(Color.YELLOW);
        gcopy.fillRect(50, 50, 20, 50);

        gcopy.dispose();
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        f.add(new ClipDemo());
        f.setVisible(true);
    }

}
