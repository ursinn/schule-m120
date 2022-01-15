package dev.ursinn.schule.m120;

import java.awt.BorderLayout;
import java.awt.Checkbox;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class JToolBarDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JToolBar toolbar = new JToolBar();
		
		toolbar.add(new JButton("Compile"));
		toolbar.add(new JButton("Undo"));
		toolbar.addSeparator();
		toolbar.add(new Checkbox("Love Bill"));
		toolbar.add(new JComboBox());
		
		frame.getContentPane().add(toolbar, BorderLayout.NORTH);
		
		toolbar = new JToolBar();
		
		Icon iconOK = new ImageIcon(ImageIconDemo.class.getResource("ok.gif"));
		Icon iconNo = new ImageIcon(ImageIconDemo.class.getResource("not.gif"));
		
		toolbar.add(new JButton(iconOK));
		toolbar.add(new JButton(iconNo));
		
		frame.getContentPane().add(toolbar, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
}
