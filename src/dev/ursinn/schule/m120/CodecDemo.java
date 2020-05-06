package dev.ursinn.schule.m120;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

public class CodecDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int n = 400;
		
		BufferedImage img = new BufferedImage(n, n, BufferedImage.TYPE_INT_RGB);
		
		Graphics g = img.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, n-1, n-1);
		for (int i = 0; i < 100; i++) {
			g.setColor(new Color((int) (Math.random()*256), (int) (Math.random()*256), (int) (Math.random()*256)));
			g.fillRect((int) (Math.random()*n), (int) (Math.random()*n), (int) (Math.random()*n/2), (int) (Math.random()*n/2));
		}
		g.dispose();
		
		int size = 0;
		for (float quality = 1f; quality >= 0; quality -= 0.25) {
			ByteArrayOutputStream out = new ByteArrayOutputStream(0xfff);
			//JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
			
			// ...
		}
	}
	
}
