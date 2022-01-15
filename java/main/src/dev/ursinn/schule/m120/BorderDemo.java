package dev.ursinn.schule.m120;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class BorderDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0,2,10,10));
		JButton b1 =  new JButton("Schamlis");
		b1.setBorder(new BevelBorder(BevelBorder.RAISED));
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("Borfluq");
		b2.setBorder(new BevelBorder(BevelBorder.LOWERED));
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("T�m T�m de L�m");
		b3.setBorder(new EtchedBorder());
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("Skromm");
		b4.setBorder(new EtchedBorder(Color.blue, Color.yellow));
		frame.getContentPane().add(b4);
		
		frame.setSize(500, 200);
		frame.setVisible(true);
	}
}
