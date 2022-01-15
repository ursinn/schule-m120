package dev.ursinn.schule.m120;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class JSpinnerDemo {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = f.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		
		SpinnerNumberModel model1 = new SpinnerNumberModel(5.0, 0.0, 10.0, 0.2);
		JSpinner spin1 = new JSpinner(model1);
		
		c.add(spin1);
		
		String comedians[] = {
			"Joseph Hader", "Charlie Chaplin", "Vicco von Büllow", "Heinz Erhard", "Michael Mittermeier"
		};
		
		
		SpinnerListModel model2 = new SpinnerListModel(comedians);
		JSpinner spin2 = new JSpinner(model2);
		
		c.add(spin2);
		
		f.pack();
		f.setVisible(true);
	}
	
}
