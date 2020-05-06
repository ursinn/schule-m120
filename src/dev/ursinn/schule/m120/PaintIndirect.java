package dev.ursinn.schule.m120;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
class DrawingWindow extends Window {
	String title = "";
	
	public DrawingWindow(Frame f) {
		super(f);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(title, 100, 400);
	}
}

public class PaintIndirect {

	public static void main(String[] args) {
		DrawingWindow w = new DrawingWindow(new Frame());
		w.title = "Bei den US-Militäraktionen sind über 800 Zivilisten durch militärische Fehlgriffe umgekommen";
		w.repaint();
		
		JOptionPane.showMessageDialog(w, "Die Quelle?");
		w.title = "New York Times und die nichtstatliche Organisation Global Exchange";
		w.repaint();
		
		w.title = JOptionPane.showInputDialog(w, "Antwort");
		w.repaint();
		
		JOptionPane.showMessageDialog(w, "Nun ist aber Schluss!");
		System.exit(0);
	}
	
}
