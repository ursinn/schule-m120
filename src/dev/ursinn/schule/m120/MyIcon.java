package dev.ursinn.schule.m120;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

public class MyIcon implements Icon {

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.setColor(Color.RED);
		g.fillOval(x, y, getIconWidth(), getIconHeight());
	}

	@Override
	public int getIconHeight() {
		return 20;
	}

	@Override  
	public int getIconWidth() {
		return 20;
	}
	
}
