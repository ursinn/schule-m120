package dev.ursinn.schule.m120;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JRadioButton rb1 = new JRadioButton("schwarz");
		frame.getContentPane().add(rb1, BorderLayout.NORTH);
		JRadioButton rb2 = new JRadioButton("weiss");
		frame.getContentPane().add(rb2, BorderLayout.SOUTH);
		
		rb1.setSelected(true);
		
		ButtonGroup g = new ButtonGroup();
		g.add(rb1);
		g.add(rb2);
		
		frame.pack();
		frame.setVisible(true);
	}
}
