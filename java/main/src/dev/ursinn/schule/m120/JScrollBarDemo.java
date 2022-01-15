package dev.ursinn.schule.m120;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class JScrollBarDemo {

	static JTextField tf;
	static JScrollBar sb;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = f.getContentPane();
		c.setLayout(new GridLayout(2,1));
		c.add(tf = new JTextField(20));
		c.add(sb = new JScrollBar(JScrollBar.HORIZONTAL, 50 ,10, 0, 100+10));
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sb.setValue(Integer.parseInt(tf.getText()));
			}
		});
		
		sb.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				tf.setText("" + sb.getValue());
			}
		});
		
		f.pack();
		f.setVisible(true);
	}
	
}
