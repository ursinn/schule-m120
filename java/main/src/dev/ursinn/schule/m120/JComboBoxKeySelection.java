package dev.ursinn.schule.m120;

import javax.swing.*;

public class JComboBoxKeySelection {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox cb = new JComboBox() {
            {
                addItem("A");
                addItem("B");
                addItem("C");
            }
        };

        cb.setKeySelectionManager((aKey, aModel) -> {
            int pos = Math.abs(aKey - 1);
            return pos >= aModel.getSize() ? aModel.getSize() - 1 : pos;
        });

        frame.getContentPane().add(cb);
        frame.pack();
        frame.setVisible(true);
    }

}
