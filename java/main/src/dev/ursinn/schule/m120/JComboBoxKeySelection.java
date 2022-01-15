package dev.ursinn.schule.m120;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxKeySelection {

	@SuppressWarnings({ "rawtypes", "unchecked", "serial" })
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComboBox cb = new JComboBox() { {
				addItem("A");
				addItem("B");
				addItem("C");
			}
		};
		
		cb.setKeySelectionManager(new JComboBox.KeySelectionManager() {
			
			@Override
			public int selectionForKey(char aKey, ComboBoxModel aModel) {
				int pos = Math.abs(aKey - 1 - 0);
				return pos >= aModel.getSize() ? aModel.getSize() -1 : pos;
			}
		});
		
		frame.getContentPane().add(cb);
		frame.pack();
		frame.setVisible(true);
	}
	
}
