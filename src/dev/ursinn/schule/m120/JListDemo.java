package dev.ursinn.schule.m120;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hitliste der Raubkopierer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final String data[] = {
				"Vietnam, 99 %",
				"El Salvador 97 %",
				"China, 96 %",
				"Slowenien, 96 %",
				"Russland, 94 %",
				"Deutschland, 42 %",
				"Australien, 35 %",
				"USA, 26 %",
				"Ende"
		};
		
		JList l = new JList(data);
		l.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				System.out.println(e);
				if (data[e.getLastIndex()].equals("Ende"));
					System.exit(0);
			}
		});
		
		frame.getContentPane().add(l);
		
		frame.pack();
		frame.setVisible(true);
	}
}
