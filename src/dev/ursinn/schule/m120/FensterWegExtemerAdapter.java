package dev.ursinn.schule.m120;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class FensterWegExtemerAdapter {

	public static void main(String[] args) {
		JFrame f =  new JFrame();
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new FensterWegAdapter());
	}
	
}

class FensterWegAdapter extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}