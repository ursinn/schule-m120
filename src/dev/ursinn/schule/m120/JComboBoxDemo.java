package dev.ursinn.schule.m120;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String lang[] = {"Java", "C++", "Perl", "Cobol", "Forth", "Lisp", "Eiffel", "Smalltalk", "Apl", "Ende"};
		
		JComboBox combo1 = new JComboBox();
		for (int i=0;i<lang.length;i++) {
			combo1.addItem(lang[i]);
		}
		frame.getContentPane().add(combo1, BorderLayout.WEST);
		
		combo1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JComboBox selectedChoice = (JComboBox) e.getSource();
				if (selectedChoice.getSelectedItem().equals("Ende"))
					System.exit(0);
			}
		});
		
		JComboBox combo2 = new JComboBox(lang);
		combo2.setEditable(true);
		combo2.setSelectedItem("Sather");
		combo2.setMaximumRowCount(4);
		
		frame.getContentPane().add(combo2, BorderLayout.EAST);
		
		frame.pack();
		frame.setVisible(true);
	}
	
}
