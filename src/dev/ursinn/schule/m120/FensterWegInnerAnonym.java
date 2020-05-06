package dev.ursinn.schule.m120;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FensterWegInnerAnonym extends JFrame {
	
	public FensterWegInnerAnonym() {
		setSize(400, 400);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new FensterWegInnerAnonym().setVisible(true);
	}

}
