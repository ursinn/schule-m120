package dev.ursinn.schule.m120;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

@SuppressWarnings("serial")
public class PopMenDemo extends JFrame {

	JPopupMenu popmenu = new JPopupMenu();
	
	PopMenDemo()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuItem entryHead = new JMenuItem("Kompaktstaubsauger");
		popmenu.add(entryHead);
		popmenu.addSeparator();
		
		String staubsauger[] = {
				"AEG Vampyrino SIX",
				"Electrolux Clario Z 1941",
				"Quelle Privileg Piccolino",
				"Siemens Super T120VS12A00",
				"Hover Micro Power Electronic SC 150",
				"Rowenta dymbo RS 014",
		};
		JMenuItem entry[] = new JMenuItem[staubsauger.length];
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
			}
		};
		
		for(int i=0; i<staubsauger.length; i++) {
			popmenu.add(entry[i] = new JMenuItem(staubsauger[i]));
			entry[i].addActionListener(al);
		}
	
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger())
					popmenu.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PopMenDemo();
	}
	
}
