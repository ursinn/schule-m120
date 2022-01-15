package dev.ursinn.schule.m120;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MiterlimitDemo extends JFrame {

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		BasicStroke stroke = new BasicStroke(15, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1);
		g2.setStroke(stroke);
		g2.draw(new Rectangle2D.Float(50, 50, 50, 50));
		stroke = new BasicStroke(15, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10);
		g2.setStroke(stroke);
		g2.draw(new Rectangle2D.Float(150, 50, 50, 50));
	}
	
	public static void main(String[] args) {
		JFrame f = new MiterlimitDemo();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(250, 150);
		f.setVisible(true);
	}
	
}
