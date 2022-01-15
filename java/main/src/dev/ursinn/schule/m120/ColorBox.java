package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColorBox extends JPanel {
    private final Random r = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        for (int y = 12; y < getHeight() - 25; y += 30) {
            for (int x = 12; x < getWidth() - 25; x += 30) {
                g.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
                g.fillRect(x, y, 25, 25);
                g.setColor(Color.BLACK);
                g.drawRect(x - 1, y - 1, 25, 25);
            }
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Neoplastizismus");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.add(new ColorBox());
        f.setVisible(true);
    }

}
