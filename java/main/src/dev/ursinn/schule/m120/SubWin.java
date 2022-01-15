package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;

public class SubWin extends JFrame {

    public SubWin(int x, int y) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(x, y);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((d.width - getSize().width) / 2, (d.height - getSize().height) / 2);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        SubWin win = new SubWin(300, 300);
    }

}
