package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;

public class NEckDemo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        PolygonWithEdges.drawNeck(g, getWidth() / 2, getHeight() / 2, 50, 6, true);
        PolygonWithEdges.drawNeck(g, getWidth() / 2, getHeight() / 2, 60, 6, false);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new NEckDemo());
        f.setSize(200, 200);
        f.setVisible(true);
    }

}

class PolygonWithEdges {
    private static final Polygon p = new Polygon();

    public static void drawNeck(Graphics g, int x, int y, int r, int n, boolean filled) {
        p.reset();
        for (int i = 0; i < n; i++)
            p.addPoint((int) (x + r * Math.cos(i * 2 * Math.PI / n)), (int) (y + r * Math.sin(i * 2 * Math.PI / n)));
        if (filled)
            g.fillPolygon(p);
        else
            g.drawPolygon(p);
    }
}
