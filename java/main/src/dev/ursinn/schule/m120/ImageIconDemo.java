package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;

public class ImageIconDemo {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon1 = new ImageIcon(ImageIconDemo.class.getResource("vegetarian.gif"));
        JLabel l1 = new JLabel(icon1);
        f.getContentPane().add(l1, BorderLayout.WEST);
        ImageIcon icon2 = new ImageIcon(ImageIconDemo.class.getResource("tweety.gif"));
        JLabel l2 = new JLabel(icon2);
        f.getContentPane().add(l2, BorderLayout.EAST);
        f.pack();
        f.setVisible(true);
    }

}
