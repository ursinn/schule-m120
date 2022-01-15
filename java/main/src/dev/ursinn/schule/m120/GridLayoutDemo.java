package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class GridLayoutDemo {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(new GridLayout(3, 2, 6, 2));

        c.add(new JLabel("Wie heisst du denn mein Kleiner?"));
        c.add(new TextField());
        c.add(new JLabel("Na, wie alt bist du denn?"));

        c.add(new JFormattedTextField(DecimalFormat.getIntegerInstance()));
        c.add(new JLabel("Dann mal das Passwort eingeben: "));
        c.add(new JPasswordField());

        f.pack();
        f.setVisible(true);
    }

}
