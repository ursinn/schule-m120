package dev.ursinn.schule.m120;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

@SuppressWarnings("serial")
public class ImageViewer extends JFrame implements ActionListener {

    private final ViewComponent viewComponent = new ViewComponent();

    public ImageViewer() {
        super("Bildbetrachter");
        JMenuBar mbar = new JMenuBar();
        JMenu menu = new JMenu("Datei");
        JMenuItem item = new JMenuItem("�ffnen");
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
        item.addActionListener(this);
        menu.add(item);
        mbar.add(menu);
        setJMenuBar(mbar);
        add(viewComponent);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser d = new JFileChooser();
        d.setFileFilter(new FileFilter() {

            @Override
            public String getDescription() {
                return "*.jpg;*.gif";
            }

            @Override
            public boolean accept(File f) {
                return f.isDirectory() || f.getName().toLowerCase().endsWith(".jpg") || f.getName().toLowerCase().endsWith(".gif");
            }
        });
        d.showOpenDialog(null);
        File file = d.getSelectedFile();
        viewComponent.setImage(file);
    }

    class ViewComponent extends JComponent {
        private Image image;

        @Override
        protected void paintComponent(Graphics g) {
            if (image != null) {
                g.drawImage(image, 0, 0, this);
            }
        }

        public void setImage(File file) {
            image = Toolkit.getDefaultToolkit().getImage(file.getAbsolutePath());
            if (image != null)
                repaint();
        }
    }

}
