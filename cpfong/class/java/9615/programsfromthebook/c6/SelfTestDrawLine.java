
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;       

public class SelfTestDrawLine extends JFrame
    implements ActionListener {

    private JPanel panel;
    private JButton button;
    private int x = 0;

    public static void main (String[] args) {
        SelfTestDrawLine frame = new SelfTestDrawLine ();
        frame.setSize(250, 300);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.white);
        window.add(panel);

        button = new JButton("Press me");
        window.add(button);
        button.addActionListener(this);
     
    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        paper.drawLine(x, 0, x, 100);
        x = x + 10;
    }
  
}



