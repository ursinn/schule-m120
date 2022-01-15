package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(new BorderLayout(5, 5));

        c.add(new JButton("Nie"), BorderLayout.NORTH);
        c.add(new JButton("ohne"), BorderLayout.EAST);
        c.add(new JButton("Seife"), BorderLayout.SOUTH);
        c.add(new JButton("waschen"), BorderLayout.WEST);
        c.add(new JButton("Center"));

        f.setSize(400, 150);
        f.setVisible(true);
    }

}
