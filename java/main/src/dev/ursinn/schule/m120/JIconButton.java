package dev.ursinn.schule.m120;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class JIconButton extends JButton {

	public JIconButton(String file) {
		super(new ImageIcon(file));
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusPainted(false);
	}

}
