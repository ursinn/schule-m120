package dev.ursinn.schule.m120;

import javax.swing.*;

public class TooltipDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String text = "<html>Ich brauch Hilfe <p>Schnell!</p></html>";
        JButton button = new JButton(text);

        String help = "<html>Hier ist die Hilfe<b>Hilfe:</b>" +
                "<ul><li>Cool bleiben</li><li>Handbuch lessen</li></ul></html>";
        button.setToolTipText(help);

        frame.getContentPane().add(button);
        frame.setSize(250, 250);
        frame.setVisible(true);
    }

}
