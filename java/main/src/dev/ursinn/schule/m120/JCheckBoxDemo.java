package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tolle Fernsehserien");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Icon unhecked = new ImageIcon(ImageIconDemo.class.getResource("not.gif"));
        Icon checked = new ImageIcon(ImageIconDemo.class.getResource("ok.gif"));
        JCheckBox cb1 = new JCheckBox("Ein Colt f�r alle F�lle", true);
        cb1.setIcon(unhecked);
        cb1.setSelectedIcon(checked);
        frame.getContentPane().add(cb1, BorderLayout.NORTH);

        JCheckBox cb2 = new JCheckBox("MacGyver", false);
        cb2.setIcon(unhecked);
        cb2.setSelectedIcon(checked);
        frame.getContentPane().add(cb2, BorderLayout.SOUTH);

        ItemListener aListener = new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e);
            }
        };

        cb1.addItemListener(aListener);
        cb2.addItemListener(aListener);

        frame.pack();
        frame.setVisible(true);
    }

}
