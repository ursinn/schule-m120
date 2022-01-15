package dev.ursinn.schule.m120;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class WindDemo extends JFrame {
	
	static GeneralPath makeRect(int x, int y, int widht, int height) {
		GeneralPath p = new GeneralPath();
		p.moveTo(x + widht/2, y - height/2);
		p.lineTo(x + widht/2, y + height/2);
		p.lineTo(x - widht/2, y + height/2);
		p.lineTo(x - widht/2, y - widht/2);
		p.closePath();
		p.moveTo(x + widht/4, y - height/4);
		p.lineTo(x + widht/4, y + height/4);
		p.lineTo(x - widht/4, y + height/4);
		p.lineTo(x - widht/4, y - height/4);
		
		return p;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.clearRect(0, 0, getSize().width-1, getSize().height-1);
		g2.setColor(Color.YELLOW);
		g2.fill(new Rectangle(70, 70, 130, 50));
	
		GeneralPath p;
		
		p = makeRect(100, 80, 50, 50);
		p.setWindingRule(GeneralPath.WIND_NON_ZERO);
		g2.setColor(Color.BLUE);
		g2.fill(p);
		
		p = makeRect(200, 80, 50, 50);
		p.setWindingRule(GeneralPath.WIND_EVEN_ODD);
		g2.setColor(Color.RED);
		g2.fill(p);
	}
	
	public static void main(String[] args) {
		JFrame f = new WindDemo();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 150);
		f.setVisible(true);
	}

}
