package dev.ursinn.schule.m120;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PrimitvZeichner {

    private final Collection<Primitiv> elements = new ArrayList<>();

    private interface Primitiv {
        void paint(Graphics g);
    }

    private class Line implements Primitiv {
        private final int x1;
        private final int y1;
        private final int x2;
        private final int y2;

        public Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        @Override
        public void paint(Graphics g) {
            g.drawLine(x1, y1, x2, y2);
        }
    }

    public void line(int x1, int y1, int x2, int y2) {
        elements.add(new Line(x1, y1, x2, y2));
    }

    public void paint(Graphics g) {
        for (Iterator<Primitiv> iter = elements.iterator(); iter.hasNext(); ) {
            iter.next().paint(g);
        }
    }

}
