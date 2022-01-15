package dev.ursinn.schule.m120;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class FlowLayoutDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox choich = new JComboBox();
		choich.addItem("Mike: Mein Gott Walter");
		choich.addItem("Sweet: Co Co");
		
		JButton playButton = new JButton("Play");
		
		c.add(choich);
		c.add(playButton);
		
		f.pack();
		f.setVisible(true);
	}
	
}
