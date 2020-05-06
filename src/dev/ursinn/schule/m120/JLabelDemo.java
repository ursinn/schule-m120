package dev.ursinn.schule.m120;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabel l = new JLabel("Lebe immer First-Class, sonst tun es Deine Erben!");
		l.setFont(new Font("Serif", Font.BOLD, 30));
		l.setForeground(Color.BLUE);
		f.getContentPane().add(l);
		l.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() > 1)
					System.exit(0);
			}
		});
		f.pack();
		f.setVisible(true);
	}
	
}
