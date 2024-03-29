package dev.ursinn.schule.m120;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BeispielListener extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JLabel label;
    JPanel panel;

    public BeispielListener() {
        this.setTitle("ActionListener Beispiel");
        this.setSize(400, 200);
        panel = new JPanel();

        // Leeres JLabel-Objekt wird erzeugt
        label = new JLabel();

        //Drei Buttons werden erstellt
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");

        //Buttons werden dem Listener zugeordnet
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        //Buttons werden dem JPanel hinzugef�gt
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        //JLabel wird dem Panel hinzugef�gt
        panel.add(label);
        this.add(panel);
    }

    public static void main(String[] args) {
        BeispielListener bl = new BeispielListener();
        bl.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.button1) {
            label.setText(("Button 1 wurde bet�tigt"));
        } else if (ae.getSource() == this.button2) {
            label.setText("Button 2 wurde bet�tigt");
        } else if (ae.getSource() == this.button3) {
            label.setText(("Button 3 wurde bet�tigt"));
        }
    }
}