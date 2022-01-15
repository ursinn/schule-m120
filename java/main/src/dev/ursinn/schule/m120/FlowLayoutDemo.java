package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());

        JComboBox choich = new JComboBox();
        choich.addItem("Mike: Mein Gott Walter");
        choich.addItem("Sweet: Co Co");

        JButton playButton = new JButton("Play");

        c.add(choich);
        c.add(playButton);

        f.pack();
        f.setVisible(true);
    }

}
