package dev.ursinn.schule.m120;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class JSliderDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4,0));
		
		JSlider slider1 = new JSlider(0, 100, 50);
		frame.getContentPane().add(slider1);
		
		JSlider slider2 = new JSlider(0, 100, 50);
		slider2.setPaintTicks(true);
		slider2.setMinorTickSpacing(5);
		frame.getContentPane().add(slider2);
		
		JSlider slider3 = new JSlider(0, 100, 50);
		slider3.setPaintTicks(true);
		slider3.setMajorTickSpacing(10);
		frame.getContentPane().add(slider3);
	
		JSlider slider4 = new JSlider(0, 100, 50);
		slider4.setPaintTicks(true);
		slider4.setMajorTickSpacing(10);
		slider4.setMinorTickSpacing(2);
		frame.getContentPane().add(slider4);
		
		frame.pack();
		frame.setVisible(true);
	}
	
}
