// The intention of this program is to test
// loading an image from a file into a panel.
// However, it takes 2 button clicks to accomplish this.
// Why?

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageDemo extends JFrame implements ActionListener {

    private Image pic;
    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        ImageDemo frame = new ImageDemo();
        frame.setSize(400,300);
        frame.createGUI();
        frame.show();
    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(150, 150));
        panel.setBackground(Color.white);
        window.add(panel);

        button = new JButton("display");
        window.add(button);
        button.addActionListener(this);

        Toolkit toolkit = panel.getToolkit();
        pic = toolkit.createImage("testimage.jpg");
    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        paper.drawImage(pic, 0, 0, 150, 150, this);
        paper.drawLine(0, 0, 111, 111);
    }
}
