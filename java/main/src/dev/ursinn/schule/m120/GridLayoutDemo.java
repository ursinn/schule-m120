package dev.ursinn.schule.m120;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;
import java.text.DecimalFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class GridLayoutDemo {

	public static void main(String[] args) {
		JFrame f =  new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		c.setLayout(new GridLayout(3, 2, 6, 2));
		
		c.add(new JLabel("Wie heisst du denn mein Kleiner?"));
		c.add(new TextField());
		c.add(new JLabel("Na, wie alt bist du denn?"));
		
		c.add(new JFormattedTextField(DecimalFormat.getIntegerInstance()));
		c.add(new JLabel("Dann mal das Passwort eingeben: "));
		c.add(new JPasswordField());
		
		f.pack();
		f.setVisible(true);
	}
	
}
