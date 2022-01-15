package dev.ursinn.schule.m120;

import javax.swing.*;
import java.awt.*;

public class MenuMitListener extends JFrame {
    // Men�leiste 
    JMenuBar menuBar;

    // Men� "Datei"
    JMenu fileMenu;

    // Men�punkt "�ffnen"
    JMenuItem openItem;

    // Men�punkt "Schlie�en"
    JMenuItem closeItem;

    public MenuMitListener() {
        this.setTitle("JMenu mit ActionListener");
        this.setSize(400, 300);

        // Men�leiste wird erzeugt
        menuBar = new JMenuBar();

        // Men� "Datei" wird erzeugt
        fileMenu = new JMenu("Datei");

        // Men�punkte werden erzeugt
        openItem = new JMenuItem("�ffnen");
        closeItem = new JMenuItem("Schlie�en");

        // Men�punkte werden dem Datei-Men� hinzugef�gt
        fileMenu.add(openItem);
        fileMenu.add(closeItem);

        //Datei-Men� wird der Men�leiste hinzugef�gt
        menuBar.add(fileMenu);

        //Men�leiste wird dem JFrame hinzugef�gt
        this.add(menuBar, BorderLayout.NORTH);

        // ActionListener wird als anonyme Klasse eingebunden
        openItem.addActionListener(new java.awt.event.ActionListener() {
            // Beim Dr�cken des Men�punktes wird actionPerformed aufgerufen
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Dateiauswahldialog wird erzeugt...
                JFileChooser fc = new JFileChooser();
                // ... und angezeigt
                fc.showOpenDialog(null);
            }
        });

        // ActionListener wird als anonyme Klasse eingebunden
        closeItem.addActionListener(new java.awt.event.ActionListener() {
            // Beim Dr�cken des Men�punktes wird actionPerformed aufgerufen
            public void actionPerformed(java.awt.event.ActionEvent e) {
                //Programm schlie�en
                System.exit(0);
            }
        });
    }


    public static void main(String[] args) {
        MenuMitListener nml = new MenuMitListener();
        nml.setVisible(true);
    }
}