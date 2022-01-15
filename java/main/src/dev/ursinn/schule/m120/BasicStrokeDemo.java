package dev.ursinn.schule.m120;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BasicStrokeDemo extends JFrame {

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setStroke(new BasicStroke(20, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER));
		g2.drawLine(30, 50, 200, 50);
		g2.setStroke(new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
		g2.drawLine(30, 100, 200, 100);
		g2.setStroke(new BasicStroke(20, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
		g2.drawLine(30, 150, 200, 150);
	}

	public static void main(String[] args) {
		JFrame f = new BasicStrokeDemo();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(260, 200);
		f.setVisible(true);
	}

}
