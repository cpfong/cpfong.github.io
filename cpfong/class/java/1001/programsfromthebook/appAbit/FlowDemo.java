//--------------STARTEXTRACT=logomethod.xtr
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowDemo extends JFrame 
    implements ActionListener {

    private JButton button1, button2;
    private JPanel panel;

    public static void main(String[] args) {
        FlowDemo frame = new FlowDemo();
        frame.setSize(350, 300);
        frame.createGUI();
        frame.show();
    }

//---------------STARTEXTRAC pate to word
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        window.add(panel);

        button1 = new JButton("button1");
        window.add(button1);
        button1.addActionListener(this);

        button2 = new JButton("button2");
        window.add(button2);
        button2.addActionListener(this);
   }
//-------------ENDEXT  pasted to word
 

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        paper.drawLine(0, 0, 100, 100);
       
    }

}
