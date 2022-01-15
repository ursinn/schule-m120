package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class JMenuDemo {
    public static void main(String[] args) {
        JMenuBar mbar;
        JMenu menuDatei, menuBearbeiten, menuHilfe;
        JMenuItem item;

        mbar = new JMenuBar();
        menuDatei = JMenuHelper.addMenuBarItem(mbar, "_Datei");
        menuBearbeiten = JMenuHelper.addMenuBarItem(mbar, "_Bearbeiten");
        menuHilfe = JMenuHelper.addMenuBarItem(mbar, "?");

        ActionListener actionProcCmd = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String action = e.getActionCommand();
                System.out.println("e.getActionCommand() = " + action);
            }
        };

        item = JMenuHelper.addMenuItem(menuDatei, "�_ffnen", 'O', actionProcCmd);
        item = JMenuHelper.addMenuItem(menuDatei, "_Speichern", 'S', actionProcCmd);
        item = JMenuHelper.addMenuItem(menuDatei, "_Beenden", 'B');
        item.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JMenuHelper.addMenuItem(menuBearbeiten, "Ausschnei_den", 'X', actionProcCmd);
        JMenuHelper.addMenuItem(menuBearbeiten, "_Kopieren", 'C', actionProcCmd);
        JMenuHelper.addMenuItem(menuBearbeiten, "E_inf�gen", 'V', actionProcCmd);


        JMenuHelper.addMenuItem(menuHilfe, "Index", actionProcCmd);
        JMenuHelper.addMenuItem(menuHilfe, "�ber dieses Programm", actionProcCmd);

        File userDir = new File(System.getProperty("user.dir"));
        String[] entries = userDir.list();
        for (int i = 0; i < entries.length; i++) {
            JMenuHelper.addMenuItem(menuDatei, entries[i], actionProcCmd);
        }

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setJMenuBar(mbar);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
