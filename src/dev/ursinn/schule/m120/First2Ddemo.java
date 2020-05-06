package dev.ursinn.schule.m120;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class First2Ddemo extends JFrame {

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.draw(new Line2D.Double(10, 40, getWidth() - 10, 70));
	}

	public static void main(String[] args) {
		JFrame f = new First2Ddemo();
		f.setSize(200, 100);
		f.setVisible(true);
	}

}
