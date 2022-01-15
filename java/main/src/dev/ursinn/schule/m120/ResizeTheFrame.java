package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ResizeTheFrame extends JFrame {

    public ResizeTheFrame() {
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ResizeTheFrame().addComponentListener(new ResizeEvent());
    }

    static class ResizeEvent extends ComponentAdapter {
        @Override
        public void componentResized(ComponentEvent e) {
            if (e.getID() == ComponentEvent.COMPONENT_RESIZED) {
                JFrame f = (JFrame) e.getComponent();
                Dimension d = f.getSize();
                int size = Math.min(d.width, d.height);

                f.setSize(size, size);
            }
        }
    }

}
