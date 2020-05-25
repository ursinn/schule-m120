package dev.ursinn.schule.m120;

import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class JMenuHelper {

	public static JMenu addMenuBarItem(JMenuBar menuBar, String s) {
		JMenu menu;
		
		if (s.indexOf("_") > -1) {
			int pos = s.indexOf("_");
			char c = s.charAt(pos+1);
			StringBuffer sb = new StringBuffer(s).delete(pos, pos+1);
			menu = new JMenu(sb.toString());
			menu.setMnemonic(c);
		} else {
			menu = new JMenu(s);
		}
		menuBar.add(menu);
		return menu;
	}
	
	public static JMenuItem addMenuItem(JMenu m, String s, char keyChar, ActionListener al) {
		if (s.startsWith("-")) {
			m.addSeparator();
			return null;
		}
		
		JMenuItem menuItem = proccessMnemonic(s);
		
		m.add(menuItem);
		
		if (keyChar != 0) {
			menuItem.setAccelerator(KeyStroke.getKeyStroke(keyChar, InputEvent.CTRL_MASK));
		}
		if (al != null) {
			menuItem.addActionListener(al);
		}
		return menuItem;
	}

	private static JMenuItem proccessMnemonic(String s) {
		if (s.indexOf("_") > -1) {
			int pos = s.indexOf("_");
			char c =  s.charAt(pos+1);
			StringBuffer sb = new StringBuffer(s).delete(pos, pos+1);
			return new JMenuItem(s.toString(), c);
		} else {
			return new JMenuItem(s);
		}
	}
	
	public static JMenuItem addMenuItem(JMenu m, String s, char keyChar) {
		return addMenuItem(m, s, keyChar, null);
	}

	public static JMenuItem addMenuItem(JMenu m, String s, ActionListener al) {
		return addMenuItem(m, s, (char)0, al);
		
	}
	
}
