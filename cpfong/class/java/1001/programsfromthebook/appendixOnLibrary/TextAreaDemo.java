
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaDemo extends JFrame implements ActionListener {

    private JButton button;
    private JTextArea textArea;

    public static void main(String[] args) {
        TextAreaDemo frame = new TextAreaDemo();
        frame.setSize(400,300);
        frame.createGUI();
        frame.show();
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        button = new JButton("Press me");
        window.add(button);
        button.addActionListener(this);

        textArea = new JTextArea(10, 10);
        window.add(textArea);
    }

    public void actionPerformed(ActionEvent event) {
        String newLine = "\r\n";
        String tab = "\t";
        textArea.setTabSize(4);

        textArea.setText(tab + "hello" + newLine);
        textArea.append(tab + "java");
    }
}
