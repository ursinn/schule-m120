package dev.ursinn.schule.m120;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class JimiDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_3BYTE_BGR);
		Graphics g = image.getGraphics();
		
		for (int i=0; i<2000; i++) {
			int x = rand(500), y=rand(500);
			
			g.setColor(new Color(rand(256*32)));
			g.drawRect(x, y, rand(500)-x, rand(500)-y);
		}
		g.dispose();
		
		String mimes[] = { "bmp", "pcx", "png", "psd", "tga", "xbm" };
		for (int i=0; i<mimes.length; i++) {
			String mime = "image/" + mimes[i];
			String filename = "JimiDemoGfx." + mimes[i];
			System.out.println("Saving " + filename + "...");
			//Jimi.putImage(mime, image, filename);
			System.out.println("done");
		}
		System.exit(0);
	}
	
	private static int rand(int max) {
		return (int) (Math.random()*max);
	}
	
}
