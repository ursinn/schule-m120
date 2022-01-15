package dev.ursinn.schule.m120;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Biene extends Frame {

    public Biene() {
        setSize(500, 100);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("\"Maja, wo bist du?\" (Mittermeier)", 100, 60);
    }

    public static void main(String[] args) {
        new Biene().setVisible(true);
    }
}
