package dev.ursinn.schule.m120;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class JProgressBarDemo {
	
	private static final int max = 20;
	private static JProgressBar bar = new JProgressBar(0, 20);
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b = new JButton("Start zählen");
		b.addActionListener(new ButtonActionListener());
		frame.getContentPane().add(bar, BorderLayout.NORTH);
		frame.getContentPane().add(b, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
	
	static class ButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for (int i=1; i<= max; i++) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						final int j = i;
						SwingUtilities.invokeLater(new Runnable() {
							
							@Override
							public void run() {
								bar.setValue(j);
							}
						});
					}
					
				}
			});
			
		}
		
	}
}
